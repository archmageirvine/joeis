package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a047.A047777;

/**
 * A053013 Positions in decimal expansion of Pi where next prime begins.
 * @author Sean A. Irvine
 */
public class A053013 extends A047777 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
    } else {
      mN += super.next().toString().length();
    }
    return Z.valueOf(mN);
  }
}
