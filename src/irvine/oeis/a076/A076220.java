package irvine.oeis.a076;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076220 Number of permutations of 1..n in which every pair of adjacent numbers are relatively prime.
 * @author Sean A. Irvine
 */
public class A076220 extends Sequence0 {

  // After Alois P. Heinz

  /*
  b:= proc(s, t) option remember; `if`(s={}, 1, add(
      `if`(igcd(i, t)>1, 0, b(s minus {i}, i)), i=s))
    end:
a:= n-> b({$1..n}, 1009):
seq(a(n), n=0..14);  # Alois P. Heinz, Aug 13 2017
   */

  private long mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int set, final int t) {
      if (set == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int k = 1, s = set; s != 0; ++k, s >>>= 1) {
        if ((s & 1) == 1 && Functions.GCD.i(k, t) == 1) {
          sum = sum.add(mB.get(set - (1 << (k - 1)), k));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mN >= Integer.SIZE) {
      throw new UnsupportedOperationException();
    }
    return mB.get((1 << mN) - 1, 2147483647);
  }
}
