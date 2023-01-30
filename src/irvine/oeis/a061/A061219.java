package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a051.A051885;

/**
 * A061219 a(n) is the largest number which can be formed with no zeros, using least number of digits and having digit sum = n.
 * @author Sean A. Irvine
 */
public class A061219 extends A051885 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }
}
