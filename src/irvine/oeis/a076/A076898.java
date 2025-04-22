package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076898 Let u(1)=u(2)=u(3)=1, u(n)=sign(u(n-1)-u(n-2))/(u(n-3)+1); then a(n) is the numerator of u(n).
 * @author Sean A. Irvine
 */
public class A076898 extends Sequence1 {

  private Q mA = null;
  private Q mB = null;
  private Q mC = null;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (mC == null) {
      if (mB == null) {
        if (mA == null) {
          mA = Q.ONE;
          return Z.ONE;
        }
        mB = Q.ONE;
        return Z.ONE;
      }
      mC = Q.ONE;
      return Z.ONE;
    }
    final Q u = new Q(mC.subtract(mB).signum()).divide(mA.add(1));
    mA = mB;
    mB = mC;
    mC = u;
    return select(u);
  }
}
