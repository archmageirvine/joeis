package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075770 Let u(1)=u(2)=u(3)=1, u(n+3)=(n*u(n)+(n+1)*u(n+1)+(n+2)*u(n+2))/(n+3); sequence gives values of n such that u(n) is an integer.
 * @author Sean A. Irvine
 */
public class A075770 extends Sequence1 {

  private Q mA = Q.ONE;
  private Q mB = Q.ONE;
  private Q mC = Q.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN >= 4) {
        final Q t = mA.multiply(mN - 3).add(mB.multiply(mN - 2)).add(mC.multiply(mN - 1)).divide(mN);
        mA = mB;
        mB = mC;
        mC = t;
      }
      if (mC.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
