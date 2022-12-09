package irvine.oeis.a088;
// manually anopan 

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A088055 a(n) = (n^(n+1)-1)/(n-1) - 1 - n!*n^n, or A031972(n) - A061711(n): sums of geometric progressions minus products of arithmetic progressions.
 * @author Georg Fischer
 */
public class A088055 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return (mN == 1) ? Z.ZERO : n.pow(mN + 1).subtract(1).divide(mN - 1).subtract(1).subtract(MemoryFactorial.SINGLETON.factorial(mN).multiply(n.pow(mN))).negate();
  }
}
