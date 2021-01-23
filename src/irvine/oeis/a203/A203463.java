package irvine.oeis.a203;

import irvine.math.z.Z;
import irvine.oeis.a020.A020985;

/**
 * A203463 Where Golay-Rudin-Shapiro sequence A020985 is positive.
 * @author Sean A. Irvine
 */
public class A203463 extends A020985 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().signum() > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
