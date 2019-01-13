package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000111;

/**
 * A004150.
 * @author Sean A. Irvine
 */
public class A004150 extends A000111 {

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }
}
