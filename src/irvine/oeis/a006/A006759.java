package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000162;

/**
 * A006759 Number of one-sided 3-dimensional polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A006759 extends A000162 {

  private final A006765 mA = new A006765();

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).subtract(1);
  }
}
