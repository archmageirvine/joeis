package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A004087.
 * @author Sean A. Irvine
 */
public class A004087 extends A000040 {

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }
}

