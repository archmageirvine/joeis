package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a038.A038119;

/**
 * A006766.
 * @author Sean A. Irvine
 */
public class A006766 extends A038119 {

  private final A006765 mA = new A006765();

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).subtract(1);
  }
}
