package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a038.A038119;
import irvine.oeis.a255.A255487;

/**
 * A006760 Number of one-sided 4-dimensional polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A006760 extends A255487 {

  /** Construct the sequence. */
  public A006760() {
    super(1);
  }

  private final A038119 mA = new A038119();

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
