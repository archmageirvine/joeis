package irvine.oeis.a068;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A068744 Number of potential flows in 3 X 3 array with integer velocities in -n..n, i.e., number of 3 X 3 arrays with adjacent elements differing by no more than n, counting arrays differing by a constant only once.
 * @author Sean A. Irvine
 */
public class A068744 extends Sequence0 {

  private int mN = -1;

  // For an m x m matrix, there are 2 * m * (m - 1) "edges"
  // We compute left to right, one column at a time
  // Edges 0, 2, 4, ..., 2*m are the velocities crossing a vertical line
  // while 1, 3, ..., 2*m-1 are the velocities crossing a horizontal line
  // Given three values v[2*k],v[2*k+1],v[2*k+1] we can fix v[2*k+1] in next column
  // (because the loop of four values must sum to 0).

  private final Map<List<Integer>, List<List<Integer>>> mCache = new HashMap<>();

  private boolean isPotential(final int n, final int[] vec) {
    for (int k = 1; k < vec.length; k += 2) {
      final int t = vec[k - 1] - vec[k] - vec[k + 1];
      if (t < -n || t > n) {
        return false;
      }
    }
    return true;
  }

  private Map<List<Integer>, Z> init(final int n, final int m) {
    final Map<List<Integer>, Z> counts = new HashMap<>();
    final int[] v = new int[2 * m - 1];
    Arrays.fill(v, -n);
    do {
      if (isPotential(n, v)) {
        counts.put(IntegerUtils.toList(v), Z.ONE);
      }
    } while (IntegerUtils.bump(v, -n, n));
    return counts;
  }

  private static boolean evenBump(final int[] a, final int min, final int max) {
    for (int k = a.length - 1; k >= 0; k -= 2) {
      if (++a[k] <= max) {
        return true;
      }
      a[k] = min;
    }
    return false;
  }

  private void update(final Map<List<Integer>, Z> counts, final List<Integer> input, final Z mul, final int n) {
    List<List<Integer>> trans = mCache.get(input);
    if (trans == null) {
      trans = new ArrayList<>();
      mCache.put(input, trans);
      final int[] vec = new int[input.size()];
      Arrays.fill(vec, -n);
      for (int k = 1; k < vec.length; k += 2) {
        final int t = input.get(k - 1) - input.get(k) - input.get(k + 1);
        vec[k] = t;
      }
      do {
        if (isPotential(n, vec)) {
          trans.add(IntegerUtils.toList(vec));
        }
      } while (evenBump(vec, -n, n));
    }
    for (final List<Integer> t : trans) {
      counts.merge(t, mul, Z::add);
    }
  }

  protected Z potentialFlows(final int n, final int m) {
    mCache.clear();
    // Compute one column at a time keeping track of flows across the right boundary
    Map<List<Integer>, Z> counts = init(n, m);
    for (int k = 1; k < m - 1; ++k) {
      final Map<List<Integer>, Z> newCounts = new HashMap<>();
      for (final Map.Entry<List<Integer>, Z> e : counts.entrySet()) {
        update(newCounts, e.getKey(), e.getValue(), n);
      }
      counts = newCounts;
      //System.out.println(n + " " + k + " " + counts.size());
    }
    return ZUtils.sum(counts.values());
  }

  @Override
  public Z next() {
    ++mN;
    // abc
    // def
    // ghi
//    long count = 0;
//    for (int ab = -mN; ab <= mN; ++ab) {
//      for (int be = -mN; be <= mN; ++be) {
//        for (int de = -mN; de <= mN; ++de) {
//          final int ad = ab - be - de;
//          if (ad >= -mN && ad <= mN) {
//            for (int bc = -mN; bc <= mN; ++bc) {
//              for (int cf = -mN; cf <= mN; ++cf) {
//                final int ef = cf - be + bc;
//                if (ef >= -mN && ef <= mN) {
//                  for (int fi = -mN; fi <= mN; ++fi) {
//                    for (int hi = -mN; hi <= mN; ++hi) {
//                      final int eh = ef - fi - hi;
//                      if (eh >= -mN && eh <= mN) {
//                        for (int gh = -mN; gh <= mN; ++gh) {
//                          final int dg = de - eh - gh;
//                          if (dg >= -mN && dg <= mN) {
//                            ++count;
//                          }
//                        }
//                      }
//                    }
//                  }
//                }
//              }
//            }
//          }
//        }
//      }
//    }

//    System.out.println("Count = " + potentialFlows(mN, 3));

    return potentialFlows(mN, 3);
  }

}
