package irvine.oeis.a035;
// manually 2020-09-17

import irvine.math.z.Z;
/**
 * A035679 Number of partitions of n into parts 8k+1 and 8k+2 with at least one part of each type.
 * @author Georg Fischer
 */
public class A035679 extends A035536 {

  /** Construct with default parameters. */
  public A035679() {
    super(1, 8, 1, new int[] { 1, 2 });
  }

  /**
   * Construct the sequence.
   * @param offset index of first term
   * @param kMod take i mod this number
   * @param mult multiply n by this factor
   * @param modules vector of valid values
   */
  public A035679(final int offset, final int kMod, final int mult, final int[] modules) {
    super(offset, kMod, mult, modules);
  }

  /**
   * Recursively evaluate all partitions and accumulate information for the condition
   * @param n number to be partitioned
   * @param i nesting level
   * @param t first accumulator
   * @param s second accumulator
   * @return number of partitions of n with this condition
   */
  @Override
  protected Z compute(final int n, final int i, final int[] cn) {
    Z result;
    if (n == 0) {
      result = total(cn);
    } else {
      if (i < 1) {
        result = Z.ZERO;
      } else {
        result = get(n, i - 1, cn);
        final int h = i % mKMod;
        boolean relevant = false;
        for (int ic = 0; ! relevant && ic < mLen; ++ic) {
          if (h == mModules[ic]) {
            relevant = true;
          }
        }
        if (relevant) {
          final int[] cnew = new int[mLen];
          Z sum = Z.ZERO;
          final int limit = n / i;
          for (int j = 1; j <= limit; ++j) {
            for (int ic = 0; ic < mLen; ++ic) {
              if (h == mModules[ic]) {
                cnew[ic] = 1;
              } else {
                cnew[ic] = cn[ic];
              }
            }
            sum = sum.add(get(n - i * j, i - 1, cnew));
          }
          result = result.add(sum);
        }
      }
    }
    return result;
  }

  /**
   * Returns the resulting number of partitions computed by the recursive method.
   * @param cn array of the additional parameters of the recursive method {@link #compute}.
   * @return number of partitions
   */
  @Override
  protected Z total(final int[] cn) {
    return Z.valueOf(cn[0]).multiply(Z.valueOf(cn[1]));
  }

}
