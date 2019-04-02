package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000108;

/**
 * A004096 Catalan numbers written backwards.
 * @author Sean A. Irvine
 */
public class A004096 extends A000108 {

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }
}

