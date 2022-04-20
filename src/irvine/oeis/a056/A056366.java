package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000007;
import irvine.oeis.a000.A000046;

/**
 * A056366 Number of primitive (period n) bracelet structures using exactly two different colored beads.
 * @author Sean A. Irvine
 */
public class A056366 extends A000046 {

  private final Sequence mA = new A000007();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
