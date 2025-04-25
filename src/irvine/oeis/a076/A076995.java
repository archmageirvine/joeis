package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076995 a(1) = 4, a(n+1) is the largest composite number &lt; 2a(n).
 * @author Sean A. Irvine
 */
public class A076995 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FOUR;
    } else {
      mA = mA.multiply2();
      do {
        mA = mA.subtract(1);
      } while (mA.isProbablePrime());
    }
    return mA;
  }
}

