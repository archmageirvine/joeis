package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a035.A035187;

/**
 * A031363 Positive numbers of the form x^2 + xy - y^2; or, of the form 5x^2 - y^2.
 * @author Sean A. Irvine
 */
public class A031363 extends A035187 {

  @Override
  public Z next() {
    while (super.next().isZero()) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
