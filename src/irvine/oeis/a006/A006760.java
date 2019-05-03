package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a038.A038119;
import irvine.oeis.a255.A255487;

/**
 * A006760 Number of <code>one-sided 4-dimensional</code> polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A006760 extends A255487 {

  private final A038119 mA = new A038119();

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
