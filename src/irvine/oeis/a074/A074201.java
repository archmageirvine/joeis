package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A074201 Let b(1)=1, b(2)=2, b(n+2)=(b(n+1)+1)/(b(n)+1); then <code>a(n) = 1</code> if b(n)&gt;=1 and <code>a(n) = 0</code> otherwise (also <code>a(n) =</code> floor(b(n)) ).
 * @author Sean A. Irvine
 */
public class A074201 implements Sequence {

  private Q mA = null;
  private Q mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Q.ONE;
      return Z.ONE;
    } else if (mB == null) {
      mB = new Q(2, 1);
      return Z.ONE;
    }
    final Q t = mB.add(Q.ONE).divide(mA.add(Q.ONE));
    mA = mB;
    mB = t;
    return t.toZ();
  }
}
