package irvine.oeis.a125;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A125676 a(n) = floor(abs(b(n))), where b(1) = 2, b(n) = b(n-1) - 1/b(n-1).
 * @author Sean A. Irvine
 */
public class A125676 extends Sequence1 {

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

