package irvine.math.group;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Number of normal subgroups of GL(2,Z_n).
 * @author Gregory Morse
 */
public final class Gl2NormalSubgroups {

  private final Map<Integer, Map<List<Z>, Long>> mBinaryTypes = new HashMap<>();

  private Map<List<Z>, Long> local(final Z prime, final int exponent, final boolean types) {
    if (prime.equals(Z.TWO)) {
      if (types) {
        return mBinaryTypes.computeIfAbsent(exponent, e -> BinaryGl2NormalSubgroups.count(e, true));
      }
      final Map<List<Z>, Long> cached = mBinaryTypes.get(exponent);
      return cached == null ? BinaryGl2NormalSubgroups.count(exponent, false) : cached;
    }
    final Map<List<Z>, Long> counts = new HashMap<>();
    // For odd p, a normal subgroup reducing to scalars is a product of
    // a central scalar subgroup and a principal determinant-one kernel.
    // Their quotient by mixed commutators is the scalar subgroup.
    // Noncentral reductions contain the principal determinant-one kernel.
    // Over F_3 the noncentral projections are Q_8, SL(2,3) and GL(2,3),
    // with mixed-commutator quotients of orders 1, 1 and 2, respectively.
    if (Z.THREE.equals(prime)) {
      Z power = Z.ONE;
      for (int j = 0; j < exponent; ++j) {
        counts.put(List.of(power), exponent + 2L);
        counts.put(List.of(power.multiply2()), exponent + 1L);
        power = power.multiply(3);
      }
    } else {
      // For p >= 5, the noncentral reductions instead give precisely the
      // preimages of the subgroups of the cyclic determinant group.
      for (final Z d : Jaguar.factor(prime.pow(exponent - 1).multiply(prime.subtract(1))).divisors()) {
        counts.put(List.of(d), exponent + 1L);
      }
    }
    return counts;
  }

  private static int maximum(final List<Integer> exponents) {
    int maximum = 0;
    for (final int e : exponents) {
      maximum = Math.max(maximum, e);
    }
    return maximum;
  }

  private static Z subgroups(final long p, final int[] ranks, final int level, final int previous) {
    if (level == 0) {
      return Z.ONE;
    }
    // Birkhoff's subgroup-type formula, with conjugate partitions.
    Z sum = Z.ZERO;
    for (int next = previous; next <= ranks[level]; ++next) {
      sum = sum.add(Binomial.gaussianBinomial(ranks[level] - previous, next - previous, p)
        .multiply(Z.valueOf(p).pow((long) previous * (ranks[level] - next)))
        .multiply(subgroups(p, ranks, level - 1, next)));
    }
    return sum;
  }

  private static Z subgroups(final long p, final List<Integer> exponents) {
    final int maximum = maximum(exponents);
    final int[] ranks = new int[maximum + 1];
    for (final int e : exponents) {
      for (int j = 1; j <= e; ++j) {
        ++ranks[j];
      }
    }
    return subgroups(p, ranks, maximum, 0);
  }

  private static void addSection(final Map<List<Integer>, Z> sections, final List<Integer> type, final Z coefficient) {
    sections.merge(type, coefficient, Z::add);
  }

  private static Map<List<Integer>, Z> sections(final long p, final List<Integer> exponents) {
    final Map<List<Integer>, Z> result = new HashMap<>();
    if (exponents.size() == 1) {
      final int e = exponents.get(0);
      result.put(exponents, Z.ONE);
      result.put(e == 1 ? List.of() : List.of(e - 1), Z.NEG_ONE);
      return result;
    }
    // Noncyclic local mixed-commutator quotients occur only at 2.
    if (p != 2) {
      throw new IllegalStateException("Noncyclic odd local quotient");
    }
    // Only sections containing 2A contribute to the subgroup-lattice
    // Möbius sum. Enumerate their images in A/2A.
    final int dimension = exponents.size();
    final int vectors = 1 << dimension;
    final int maximum = maximum(exponents);
    final List<BitSet> spaces = new ArrayList<>();
    final Set<BitSet> known = new HashSet<>();
    final BitSet zero = new BitSet(vectors);
    zero.set(0);
    spaces.add(zero);
    known.add(zero);
    for (int i = 0; i < spaces.size(); ++i) {
      final BitSet space = spaces.get(i);
      for (int t = space.nextClearBit(1); t < vectors; t = space.nextClearBit(t + 1)) {
        final BitSet next = (BitSet) space.clone();
        for (int u = space.nextSetBit(0); u >= 0; u = space.nextSetBit(u + 1)) {
          next.set(t ^ u);
        }
        if (known.add(next)) {
          spaces.add(next);
        }
      }
      final int codimension = dimension - Integer.numberOfTrailingZeros(space.cardinality());
      Z coefficient = Z.ONE.shiftLeft(codimension * (codimension - 1) / 2);
      if ((codimension & 1) == 1) {
        coefficient = coefficient.negate();
      }
      final int[] ranks = new int[maximum + 2];
      for (int k = 1, previous = 0; k <= maximum; ++k) {
        int mask = 0;
        int restricted = 0;
        for (int j = 0; j < dimension; ++j) {
          final int e = exponents.get(j);
          restricted += Math.min(k, e - 1);
          if (e > k) {
            mask |= 1 << j;
          }
        }
        int intersection = 0;
        for (int u = space.nextSetBit(0); u >= 0; u = space.nextSetBit(u + 1)) {
          if ((u & mask) == 0) {
            ++intersection;
          }
        }
        final int annihilated = restricted + Integer.numberOfTrailingZeros(intersection);
        ranks[k] = annihilated - previous;
        previous = annihilated;
      }
      final List<Integer> type = new ArrayList<>();
      for (int k = 1; k <= maximum; ++k) {
        for (int j = ranks[k + 1]; j < ranks[k]; ++j) {
          type.add(k);
        }
      }
      addSection(result, type, coefficient);
    }
    return result;
  }

  private static Z onto(final long p, final List<Map<List<Integer>, Z>> sections, final int index,
                        final List<Integer> exponents) {
    if (index == sections.size()) {
      return subgroups(p, exponents);
    }
    Z sum = Z.ZERO;
    for (final Map.Entry<List<Integer>, Z> entry : sections.get(index).entrySet()) {
      final List<Integer> joined = new ArrayList<>(exponents);
      joined.addAll(entry.getKey());
      sum = sum.add(entry.getValue().multiply(onto(p, sections, index + 1, joined)));
    }
    return sum;
  }

  private static Z onto(final List<List<Z>> types) {
    final Map<Z, List<Map<List<Integer>, Z>>> primeSections = new HashMap<>();
    for (final List<Z> type : types) {
      final Map<Z, List<Integer>> primary = new HashMap<>();
      for (final Z order : type) {
        final FactorSequence fs = Jaguar.factor(order);
        for (final Z p : fs.toZArray()) {
          primary.computeIfAbsent(p, k -> new ArrayList<>()).add(fs.getExponent(p));
        }
      }
      for (final Map.Entry<Z, List<Integer>> entry : primary.entrySet()) {
        final Z p = entry.getKey();
        primeSections.computeIfAbsent(p, k -> new ArrayList<>()).add(sections(p.longValueExact(), entry.getValue()));
      }
    }
    Z product = Z.ONE;
    for (final Map.Entry<Z, List<Map<List<Integer>, Z>>> entry : primeSections.entrySet()) {
      if (entry.getValue().size() > 1) {
        product = product.multiply(onto(entry.getKey().longValueExact(), entry.getValue(), 0, List.of()));
      }
    }
    return product;
  }

  private static Z combine(final List<Map<List<Z>, Long>> factors, final int index, final List<List<Z>> types) {
    if (index == factors.size()) {
      return onto(types);
    }
    Z sum = Z.ZERO;
    for (final Map.Entry<List<Z>, Long> choice : factors.get(index).entrySet()) {
      types.add(choice.getKey());
      sum = sum.add(combine(factors, index + 1, types).multiply(choice.getValue()));
      types.remove(types.size() - 1);
    }
    return sum;
  }

  /**
   * Count normal subgroups of GL(2,Z_n).
   * @param n positive modulus
   * @return normal-subgroup count
   */
  public Z count(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    final Z[] primes = fs.toZArray();
    final List<Map<List<Z>, Long>> factors = new ArrayList<>();
    for (final Z p : primes) {
      factors.add(local(p, fs.getExponent(p), primes.length > 1));
    }
    if (factors.size() == 1) {
      return Z.valueOf(factors.get(0).values().stream().mapToLong(Long::longValue).sum());
    }
    // For prescribed projections P_i, a normal subgroup must contain
    // the product of [G_i,P_i]. The remaining choices are precisely the
    // subdirect products of the resulting finite abelian quotients.
    return combine(factors, 0, new ArrayList<>());
  }
}
