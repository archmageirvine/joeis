package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000142;

/**
 * A004153.
 * @author Sean A. Irvine
 */
public class A004153 extends A000142 {

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }
}
