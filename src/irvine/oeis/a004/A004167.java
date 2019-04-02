package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000244;

/**
 * A004167 Powers of 3 written backwards.
 * @author Sean A. Irvine
 */
public class A004167 extends A000244 {

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }
}
