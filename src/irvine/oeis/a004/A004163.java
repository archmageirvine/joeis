package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000326;

/**
 * A004163.
 * @author Sean A. Irvine
 */
public class A004163 extends A000326 {

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }
}
