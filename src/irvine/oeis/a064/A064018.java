package irvine.oeis.a064;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064018 a(n) = A002088(10^n) = Sum_{k &lt;= 10^n} phi(k), sum of the Euler totients phi = A000010.
 * @author Sean A. Irvine
 */
public class A064018 extends Sequence0 {

  protected long mN = 1;
  private long mM = 1;
  private Z mSum = null;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
    } else {
      mN *= 10;
      while (mM < mN) {
        mSum = mSum.add(Euler.phi(++mM));
      }
    }
    return mSum;
  }
}
