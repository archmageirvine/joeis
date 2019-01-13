package irvine.math.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import irvine.math.api.Set;

/**
 * Hold a permutation on a set.
 * @author Sean A. Irvine
 * @param <T> underlying element type
 */
public class Permutation<T> extends AbstractFunction<T, T> implements Comparable<Permutation<T>> {

  private final Map<T, T> mPerm;

  /**
   * Convenience method to create an integer partition.  The permutation elements
   * are assumed to be numbered from 1.
   * @param p permutation elements
   * @return the permutation
   */
  public static Permutation<Integer> create(final int... p) {
    final Map<Integer, Integer> map = new HashMap<>(p.length);
    for (int k = 0; k < p.length; ++k) {
      map.put(k + 1, p[k]);
    }
    return new Permutation<>(new IntegerSet(1, p.length), map);
  }

  /**
   * Create identity permutation of given size.
   * @param n size
   * @return identity permutation
   */
  public static Permutation<Integer> identity(final int n) {
    return new Permutation<>(new IntegerSet(1, n), Collections.emptyMap());
  }

  /**
   * A permutation initialized from a map.  Any set elements not mentioned in
   * the map are assumed to be invariant.
   * @param set set the permutation is over
   * @param permutation the permutation as a map
   */
  public Permutation(final Set<T> set, final Map<T, T> permutation) {
    super(set, set);
    mPerm = permutation;
  }

  @Override
  public T image(final T x) {
    return mPerm.getOrDefault(x, x);
  }

  @Override
  public Set<T> image() {
    return domain();
  }

  @Override
  public boolean isOnto() {
    return true;
  }

  @Override
  public boolean isOneToOne() {
    return true;
  }

  @SuppressWarnings({ "unchecked", "rawtypes" })
  private int forcedCompare(final T a, final T b) {
    return ((Comparable) a).compareTo(b);
  }

  @Override
  public int compareTo(final Permutation<T> other) {
    if (this == other) {
      return 0;
    }
    for (final T d : domain()) {
      final T a = image(d);
      final T b = other.image(d);
      if (a.equals(b)) {
        continue;
      }
      if (a instanceof Comparable<?>) {
        return forcedCompare(a, b);
      } else {
        return a.hashCode() - b.hashCode();
      }
    }
    return 0;
  }

  /**
   * Return the permutation as cycles.
   * @return cycle notation
   */
  public List<List<T>> cycleStructure() {
    final HashSet<T> seen = new HashSet<>();
    final ArrayList<List<T>> cycles = new ArrayList<>();
    for (final T k : domain()) {
      if (!seen.contains(k)) {
        final ArrayList<T> cyc = new ArrayList<>();
        T j = k;
        do {
          seen.add(j);
          cyc.add(j);
          j = image(j);
        } while (!seen.contains(j));
        if (cyc.size() > 1) {
          cycles.add(cyc);
        }
      }
    }
    // We normally don't report 1-cycles, but in the case of the identity
    // we output () to indicate this
    if (cycles.isEmpty()) {
      cycles.add(Collections.emptyList());
    }
    return cycles;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("[");
    for (final T k : domain()) {
      if (sb.length() > 1) {
        sb.append(", ");
      }
      sb.append(image(k));
    }
    sb.append(']');
    return sb.toString();
  }

  /**
   * Return an array indicating the number of cycles of each length in this
   * permutation.  The array always has 0 in position 0 and is the length of
   * the permutation + 1 even though higher entries are often 0.  The result
   * is such that <code>sum(k*cycleLengths[k])=permutationLength</code>.
   * @return number of cycles at each length
   */
  public int[] cycleLengths() {
    final int[] res = new int[mPerm.size() + 1];
    final HashSet<T> seen = new HashSet<>();
    for (final T k : domain()) {
      if (!seen.contains(k)) {
        int cycLength = 0;
        T j = k;
        do {
          seen.add(j);
          ++cycLength;
          j = image(j);
        } while (!seen.contains(j));
        res[cycLength]++;
      }
    }
    return res;
  }

  /**
   * Test if this is an even permutation.
   * @return true iff the permutation is even
   */
  public boolean isEven() {
    // We need to be able to order the elements, so first construct an ordering.
    final Set<T> domain = domain();
    final Map<T, Long> ordering = new HashMap<>(domain.size().intValueExact());
    long k = 0;
    for (final T s : domain) {
      ordering.put(s, k++);
    }
    // Now check x < y, image(x) > image(y) to determine evenness
    boolean even = true;
    for (final T y : domain) {
      for (final T x : domain) {
        if (ordering.get(x) < ordering.get(y)) {
          final T xi = image(x);
          final T yi = image(y);
          if (ordering.get(xi) > ordering.get(yi)) {
            even = !even;
          }
        }
      }
    }
    return even;
  }

  /**
   * Test if permutation is the identity.
   * @return true iff is the identity
   */
  public boolean isIdentity() {
    for (final T s : domain()) {
      if (!s.equals(image(s))) {
        return false;
      }
    }
    return true;
  }

  /**
   * Construct the inverse of this permutation.
   * @return inverse permutation
   */
  public Permutation<T> inverse() {
    final Map<T, T> inverseMap = new HashMap<>();
    for (final Map.Entry<T, T> e : mPerm.entrySet()) {
      inverseMap.put(e.getValue(), e.getKey());
    }
    return new Permutation<>(domain(), inverseMap);
  }

  /**
   * First this permutation then the other one.
   * @param other permutation
   * @return result of composition
   */
  public Permutation<T> compose(final Permutation<T> other) {
    // todo this could check compatibility of domains
    final Map<T, T> map = new HashMap<>();
    for (final T e : domain()) {
      final T f = other.image(image(e));
      if (!e.equals(f)) {
        map.put(e, f);
      }
    }
    return new Permutation<>(domain(), map);
  }

  /**
   * The largest non-fixed element of an integer permutation.
   * @param permutation permutation
   * @return degree
   */
  public static int degree(final Permutation<Integer> permutation) {
    int k;
    for (k = permutation.domain().size().intValueExact(); k > 0; --k) {
      if (permutation.image(k) != k) {
        break;
      }
    }
    return k;
  }
}
