package irvine.math.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.MemoryFunction;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Equivariant inverse-contraction counts on decorated vertex cycle types.
 * @author Gregory Morse
 */
final class SomeValidOrbitCounts {

  private static final List<Integer> FIXED = List.of(1);
  private final LabeledValidHeaders mLabeled = new LabeledValidHeaders();

  private static final class Orbit implements Comparable<Orbit> {
    private final int mLength;
    private final List<Integer> mPayload;

    private Orbit(final int length, final List<Integer> payload) {
      mLength = length;
      mPayload = payload;
    }

    @Override
    public int compareTo(final Orbit other) {
      final int length = Integer.compare(mLength, other.mLength);
      if (length != 0) {
        return length;
      }
      for (int k = 0; k < Math.min(mPayload.size(), other.mPayload.size()); ++k) {
        final int c = Integer.compare(mPayload.get(k), other.mPayload.get(k));
        if (c != 0) {
          return c;
        }
      }
      return Integer.compare(mPayload.size(), other.mPayload.size());
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof Orbit && compareTo((Orbit) obj) == 0;
    }

    @Override
    public int hashCode() {
      return 31 * mLength + mPayload.hashCode();
    }
  }

  private static Z nonempty(final long cells) {
    return Z.ONE.shiftLeft(cells).subtract(1);
  }

  // Bareiss elimination of the directed matrix-tree minor.
  private static Z determinant(final Z[][] matrix) {
    final int n = matrix.length;
    if (n == 0) {
      return Z.ONE;
    }
    Z previous = Z.ONE;
    boolean negate = false;
    for (int k = 0; k < n - 1; ++k) {
      if (matrix[k][k].isZero()) {
        int r = k + 1;
        while (r < n && matrix[r][k].isZero()) {
          ++r;
        }
        if (r == n) {
          return Z.ZERO;
        }
        final Z[] row = matrix[k];
        matrix[k] = matrix[r];
        matrix[r] = row;
        negate = !negate;
      }
      final Z pivot = matrix[k][k];
      for (int i = k + 1; i < n; ++i) {
        for (int j = k + 1; j < n; ++j) {
          final Z[] qr = pivot.multiply(matrix[i][j]).subtract(matrix[i][k].multiply(matrix[k][j])).divideAndRemainder(previous);
          if (!qr[1].isZero()) {
            throw new ArithmeticException("Inexact determinant division");
          }
          matrix[i][j] = qr[0];
        }
        matrix[i][k] = Z.ZERO;
      }
      previous = pivot;
    }
    return negate ? matrix[n - 1][n - 1].negate() : matrix[n - 1][n - 1];
  }

  private static Z trees(final Orbit root, final List<Orbit> kept, final List<Orbit> deleted) {
    final List<Orbit> vertices = new ArrayList<>(List.of(root));
    vertices.addAll(kept);
    vertices.addAll(deleted);
    final int n = vertices.size() - 1;
    final Z[][] matrix = new Z[n][n];
    for (int i = 0; i < n; ++i) {
      Arrays.fill(matrix[i], Z.ZERO);
      final int length = vertices.get(i + 1).mLength;
      for (int j = 0; j <= kept.size(); ++j) {
        final Orbit parent = vertices.get(j);
        if (j == i + 1 || length % parent.mLength != 0) {
          continue;
        }
        long cells = 0;
        for (final int p : parent.mPayload) {
          cells += Functions.GCD.i(p, length / parent.mLength);
        }
        final Z choices = nonempty(cells).multiply(parent.mLength);
        matrix[i][i] = matrix[i][i].add(choices);
        if (j != 0) {
          matrix[i][j - 1] = matrix[i][j - 1].subtract(choices);
        }
      }
    }
    return determinant(matrix);
  }

  private static List<Integer> masses(final List<Orbit> orbits) {
    final List<Integer> result = new ArrayList<>();
    for (final Orbit orbit : orbits) {
      result.add(orbit.mPayload.size());
    }
    Collections.sort(result);
    return result;
  }

  private final MemoryFunction<List<Orbit>, Map<Orbit, Z>> mBlocks = new MemoryFunction<>() {
    @Override
    protected Map<Orbit, Z> compute(final List<Orbit> orbits) {
      if (orbits.size() == 1) {
        return Map.of(orbits.get(0), Z.ONE);
      }
      final Map<Orbit, Z> result = new HashMap<>();
      if (orbits.stream().allMatch(o -> o.mLength == 1 && o.mPayload.stream().allMatch(p -> p == 1))) {
        mLabeled.forest(masses(orbits)).forEach((m, count) -> result.put(new Orbit(1, Collections.nCopies(m, 1)), count));
        return result;
      }
      for (final Map.Entry<Orbit, Integer> choice : PartMultisets.counts(orbits).entrySet()) {
        final Orbit root = choice.getKey();
        if (orbits.stream().anyMatch(o -> o.mLength % root.mLength != 0)) {
          continue;
        }
        final List<Orbit> rest = PartMultisets.subtract(orbits, List.of(root));
        for (final Pair<List<Orbit>, Z> selection : PartMultisets.subsets(rest)) {
          final List<Orbit> kept = selection.left();
          final List<Orbit> deleted = PartMultisets.subtract(rest, kept);
          final Z tree = trees(root, kept, deleted);
          if (tree.isZero()) {
            continue;
          }
          final List<Integer> payload = new ArrayList<>(root.mPayload);
          long returns = 0;
          for (final Orbit orbit : kept) {
            returns += orbit.mPayload.size();
            for (final int p : orbit.mPayload) {
              payload.add(p * (orbit.mLength / root.mLength));
            }
          }
          Collections.sort(payload);
          final Z term = tree.multiply(choice.getValue()).multiply(selection.right()).shiftLeft(returns);
          result.merge(new Orbit(root.mLength, payload), (deleted.size() & 1) == 0 ? term : term.negate(), Z::add);
        }
      }
      return result;
    }
  };

  private final MemoryFunction<List<Orbit>, Map<List<Orbit>, Z>> mAssemblies = new MemoryFunction<>() {
    @Override
    protected Map<List<Orbit>, Z> compute(final List<Orbit> orbits) {
      if (orbits.isEmpty()) {
        return Map.of(List.of(), Z.ONE);
      }
      final List<Orbit> rest = orbits.subList(1, orbits.size());
      final Map<List<Orbit>, Z> result = new HashMap<>();
      for (final Pair<List<Orbit>, Z> selection : PartMultisets.subsets(rest)) {
        final List<Orbit> block = PartMultisets.union(List.of(orbits.get(0)), selection.left());
        final Map<List<Orbit>, Z> suffixes = getValue(PartMultisets.subtract(rest, selection.left()));
        for (final Map.Entry<Orbit, Z> first : mBlocks.getValue(block).entrySet()) {
          final Z weight = selection.right().multiply(first.getValue());
          if (weight.isZero()) {
            continue;
          }
          for (final Map.Entry<List<Orbit>, Z> suffix : suffixes.entrySet()) {
            List<Orbit> state = PartMultisets.union(List.of(first.getKey()), suffix.getKey());
            if (state.get(state.size() - 1).mLength == 1) {
              final List<Orbit> normalized = new ArrayList<>();
              for (final int mass : masses(state)) {
                normalized.add(new Orbit(1, Collections.nCopies(mass, 1)));
              }
              state = normalized;
            }
            result.merge(state, weight.multiply(suffix.getValue()), Z::add);
          }
        }
      }
      return result;
    }
  };

  private final MemoryFunction<List<Orbit>, Z> mSome = new MemoryFunction<>() {
    @Override
    protected Z compute(final List<Orbit> orbits) {
      final int n = orbits.size();
      final int length = orbits.get(n - 1).mLength;
      if (length == 1) {
        return mLabeled.some(masses(orbits));
      }
      Z total = Z.ZERO;
      if (orbits.get(0).mLength == length) {
        total = Functions.PHI.z(length).multiply(Functions.FACTORIAL.z(n - 1)).multiply(Z.valueOf(length).pow(n - 1));
        for (final Orbit orbit : orbits) {
          total = total.multiply(nonempty(orbit.mPayload.size()));
        }
        if ((n & 1) == 0) {
          total = total.negate();
        }
      }
      for (final Map.Entry<List<Orbit>, Z> entry : mAssemblies.getValue(orbits).entrySet()) {
        final int d = n - entry.getKey().size();
        if (d > 0 && !entry.getValue().isZero()) {
          final Z term = entry.getValue().multiply(getValue(entry.getKey()));
          total = (d & 1) == 0 ? total.subtract(term) : total.add(term);
        }
      }
      return total;
    }
  };

  Z fixed(final List<Integer> cycles) {
    final List<Orbit> orbits = new ArrayList<>();
    for (final int length : cycles) {
      orbits.add(new Orbit(length, FIXED));
    }
    return mSome.getValue(orbits);
  }
}
