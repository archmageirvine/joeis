package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077035 a(1)=7; a(n),a(n+1) are smallest &gt; a(n-1) such that a(n-1)^2+a(n)^2=a(n+1)^2.
 * @author Sean A. Irvine
 */
public class A077035 extends Sequence1 {

  private Z mA = null;
  private Z mB = Z.SEVEN;

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

