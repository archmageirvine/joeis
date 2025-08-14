package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079450 a(n) = 2^(n-1)*u(n) where u(1)=1 and u(n) = frac(3/2*u(n-1)) + 1.
 * @author Sean A. Irvine
 */
public class A079450 extends Sequence1 {

  private Q mU = Q.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mU = mU.multiply(3).divide(2).frac().add(1);
    }
    return mU.multiply(Z.ONE.shiftLeft(mN)).toZ();
  }
}
