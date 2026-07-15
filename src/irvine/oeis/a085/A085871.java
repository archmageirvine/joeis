package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085871 a(1) = 2, a(2n) = smallest prime of the form k*a(2n-1) +1, k &gt;1, a(2n+1) = smallest prime of the form r*a(2n)-1, r &gt;1.
 * @author Sean A. Irvine
 */
public class A085871 extends Sequence1 {

  private Z mA = null;
  private long mAdd = -1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    mAdd = -mAdd;
    Z s = mA.add(mAdd);
    while (true) {
      s = s.add(mA);
      if (s.isProbablePrime()) {
        mA = s;
        return s;
      }
    }
  }
}
