package irvine.oeis.a125;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A125676 <code>a(n) =</code> floor(|b(n)|), where b(1) <code>= 2,</code> b(n) = b(n-1) - 1/b(n-1).
 * @author Sean A. Irvine
 */
public class A125676 implements Sequence {

  private Q mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = new Q(Z.TWO);
    } else {
      mN = mN.subtract(Q.ONE.divide(mN));
    }
    return mN.abs().toZ();
  }
}

