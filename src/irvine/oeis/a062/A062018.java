package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000312;

/**
 * A062018 a(n) = n^n written backwards.
 * @author Sean A. Irvine
 */
public class A062018 extends A000312 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }
}
