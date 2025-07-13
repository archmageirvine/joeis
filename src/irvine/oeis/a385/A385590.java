package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385590 Triangle read by rows, based on Fibonacci numbers: Let i &gt; 1 be such that F(i) &lt;= n &lt; F(i+1); i.e., i = A130233(n). Then T(n, k) = F(i-1)^2 + 1 - (i-1) mod 2 + (n - F(i)) * F(i-2) + (k-1) * F(i-1) where F(k) = A000045(k).
 * @author Sean A. Irvine
 */
public class A385590 extends Sequence1 {

  private long mN = 0;
  private long mI = 0;
  private long mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      while (Functions.FIBONACCI.l(mI + 1) <= mN) {
        ++mI;
      }
      mT = Functions.FIBONACCI.z(mI - 1).square().add(1 - ((mI - 1) & 1)).add(Functions.FIBONACCI.z(mI - 2).multiply(Z.valueOf(mN).subtract(Functions.FIBONACCI.z(mI))));
    }
    return mT.add(Functions.FIBONACCI.z(mI - 1).multiply(mM - 1));
  }
}

