package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A070655.
 * @author Sean A. Irvine
 */
public class A070748 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(CR.valueOf(super.next()).sin().signum());
  }
}
