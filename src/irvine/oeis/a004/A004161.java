package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000292;

/**
 * A004161.
 * @author Sean A. Irvine
 */
public class A004161 extends A000292 {

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }
}
