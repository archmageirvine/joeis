package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.q.Q;

/**
 * Exact certificates that a rational matrix group acts on a signed regular simplex.
 * @author Gregory Morse
 */
final class RationalSimplexFrames {

  private RationalSimplexFrames() { }

  private static List<Q> action(final List<Q> v, final Q[][] g) {
    final int n = g.length;
    final Q[] result = new Q[n];
    Arrays.fill(result, Q.ZERO);
    for (int i = 0; i < n; ++i) {
      if (v.get(i).signum() != 0) {
        for (int j = 0; j < n; ++j) {
          if (g[i][j].signum() != 0) {
            result[j] = result[j].add(v.get(i).multiply(g[i][j]));
          }
        }
      }
    }
    return List.of(result);
  }

  private static Q dot(final List<Q> a, final List<Q> b) {
    Q value = Q.ZERO;
    for (int i = 0; i < a.size(); ++i) {
      if (a.get(i).signum() != 0 && b.get(i).signum() != 0) {
        value = value.add(a.get(i).multiply(b.get(i)));
      }
    }
    return value;
  }

  private static List<Q> negative(final List<Q> a) {
    final List<Q> result = new ArrayList<>(a.size());
    for (final Q x : a) {
      result.add(x.negate());
    }
    return result;
  }

  private static List<List<Q>> orbit(final Q[][][] generators, final List<Q> seed, final int limit) {
    final List<List<Q>> queue = new ArrayList<>();
    final Set<List<Q>> seen = new HashSet<>();
    queue.add(seed);
    seen.add(seed);
    for (int k = 0; k < queue.size(); ++k) {
      for (final Q[][] g : generators) {
        final List<Q> next = action(queue.get(k), g);
        if (seen.add(next)) {
          if (queue.size() >= limit) {
            return List.of();
          }
          queue.add(next);
        }
      }
    }
    return queue;
  }

  private static boolean simplex(final Q[][][] generators, final Q[][] form, final List<List<Q>> orbit) {
    final int n = form.length;
    if (orbit.size() != 2 * (n + 1)) {
      return false;
    }
    final List<Q> first = orbit.get(0);
    final List<Q> firstForm = action(first, form);
    final Q norm = dot(first, firstForm);
    if (norm.signum() <= 0) {
      return false;
    }
    final Q between = norm.negate().divide(new Q(n));
    final Set<List<Q>> points = new HashSet<>();
    points.add(first);
    for (final List<Q> point : orbit) {
      if (!points.contains(point) && !points.contains(negative(point))) {
        points.add(dot(firstForm, point).signum() > 0 ? negative(point) : point);
      }
    }
    if (points.size() != n + 1) {
      return false;
    }
    for (final List<Q> a : points) {
      final List<Q> af = action(a, form);
      for (final List<Q> b : points) {
        if (!dot(af, b).equals(a.equals(b) ? norm : between)) {
          return false;
        }
      }
    }
    // The checked Gram matrix has rank n and all-ones nullspace.
    // These points form a full affine simplex; the only allowable
    // signs are the same sign on every point of each generator image.
    for (final Q[][] g : generators) {
      if (!points.stream().allMatch(a -> points.contains(action(a, g)))
        && !points.stream().allMatch(a -> points.contains(negative(action(a, g))))) {
        return false;
      }
    }
    return true;
  }

  static boolean isSignedSimplex(final Q[][][] generators, final Q[][] form, final List<Q> seed) {
    final int n = form.length;
    final List<List<Q>> shortOrbit = orbit(generators, seed, n * (n + 1));
    if (simplex(generators, form, shortOrbit)) {
      return true;
    }
    if (shortOrbit.size() != n * (n + 1)) {
      return false;
    }
    // In an A_n root shell, the roots e_i-e_j sharing a fixed tail
    // form an n-clique at half the root norm. Their sum spans the
    // corresponding simplex-vertex line. Use this only to find a seed:
    // the final simplex certificate does not assume the shell is A_n.
    final List<Q> f = action(seed, form);
    final Q half = dot(f, seed).divide(Q.TWO);
    final List<List<Q>> adjacent = new ArrayList<>();
    for (final List<Q> root : shortOrbit) {
      if (dot(f, root).equals(half)) {
        adjacent.add(root);
      }
    }
    for (final List<Q> first : adjacent) {
      final List<List<Q>> clique = new ArrayList<>();
      final List<List<Q>> forms = new ArrayList<>();
      clique.add(seed);
      clique.add(first);
      forms.add(f);
      forms.add(action(first, form));
      for (final List<Q> root : adjacent) {
        if (!clique.contains(root) && forms.stream().allMatch(a -> dot(a, root).equals(half))) {
          clique.add(root);
          forms.add(action(root, form));
        }
        if (clique.size() == n) {
          final Q[] sum = new Q[n];
          Arrays.fill(sum, Q.ZERO);
          for (final List<Q> v : clique) {
            for (int i = 0; i < n; ++i) {
              sum[i] = sum[i].add(v.get(i));
            }
          }
          if (simplex(generators, form, orbit(generators, List.of(sum), 2 * (n + 1)))) {
            return true;
          }
          break;
        }
      }
    }
    return false;
  }
}
