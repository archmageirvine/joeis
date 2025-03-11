package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075832 Let u(1) = u(2) = u(3) = u(4) = 1, u(n+4)*(n+4) = u(n+3)*(n+3)+u(n+2)*(n+2)+u(n+1)*(n+1)+u(n)*n; sequence gives values of n such that u(n) is an integer.
 * @author Sean A. Irvine
 */
public class A075832 extends Sequence1 {

  private Q mA = Q.ONE;
  private Q mB = Q.ONE;
  private Q mC = Q.ONE;
  private Q mD = Q.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN >= 5) {
        final Q t = mA.multiply(mN - 4).add(mB.multiply(mN - 3)).add(mC.multiply(mN - 2)).add(mD.multiply(mN - 1)).divide(mN);
        mA = mB;
        mB = mC;
        mC = mD;
        mD = t;
      }
      if (mD.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
