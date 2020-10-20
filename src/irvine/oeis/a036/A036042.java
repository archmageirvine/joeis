package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A036042 k appears partition(k) times.
 * @author Sean A. Irvine
 */
public class A036042 extends A000041 {

  private Z mC = super.next();

  @Override
  public Z next() {
    if (Z.ZERO.equals(mC)) {
      mC = super.next();
    }
    mC = mC.subtract(1);
    return Z.valueOf(mN);
  }
}

