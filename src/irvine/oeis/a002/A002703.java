package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a262.A262568;

/**
 * A002703 Sets with a congruence property.
 * @author Sean A. Irvine
 */
public class A002703 extends A262568 {

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
