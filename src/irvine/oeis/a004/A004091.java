package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;

/**
 * A004091.
 * @author Sean A. Irvine
 */
public class A004091 extends A000045 {

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }
}

