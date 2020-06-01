package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a035.A035187;

/**
 * A031363 Positive numbers of the form <code>x^2 + xy - y^2;</code> or, of the form <code>5x^2 - y^2</code>.
 * @author Sean A. Irvine
 */
public class A031363 extends A035187 {

  @Override
  public Z next() {
    while (Z.ZERO.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
