package irvine.oeis.a203;

import irvine.math.z.Z;
import irvine.oeis.a020.A020985;

/**
 * A203463 Where <code>Golay-Rudin-Shapiro</code> sequence <code>A020985</code> is positive.
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
