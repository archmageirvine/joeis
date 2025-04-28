package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077034 a(1)=3; a(2n), a(2n+1) are smallest integers &gt; a(2n-1) such that a(2n-1)^2+a(2n)^2=a(2n+1)^2.
 * @author Sean A. Irvine
 */
public class A077034 extends Sequence1 {

  private Z mA = null;
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    if (mB != null) {
      mA = mB;
      mB = null;
      return mA;
    }
    final Z s = mA.square();
    Z m = mA;
    while (true) {
      m = m.add(1);
      final Z[] sr = s.add(m.square()).sqrtAndRemainder();
      if (sr[1].isZero()) {
        mA = m; // not actually necessary
        mB = sr[0];
        return m;
      }
    }
  }
}

