package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a151.A151830;

/**
 * A006764 Number of fixed properly-4-dimensional polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A006764 extends A151830 {

  private final A006763 mA = new A006763();
  private final A006762 mB = new A006762();

  @Override
  public Z next() {
    return Z.ZERO.max(super.next().subtract(mA.next().multiply(4)).subtract(mB.next().multiply(6)).subtract(4));
  }
}
