package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000110;

/**
 * A004098 Bell numbers written backwards.
 * @author Sean A. Irvine
 */
public class A004098 extends A000110 {

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }
}

