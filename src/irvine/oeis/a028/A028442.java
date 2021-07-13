package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a002.A002321;

/**
 * A028442 Numbers k such that Mertens's function M(k) (A002321) is zero.
 * @author Sean A. Irvine
 */
public class A028442 extends A002321 {

  @Override
  public Z next() {
    while (!super.next().isZero()) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
