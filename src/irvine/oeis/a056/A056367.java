package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000046;

/**
 * A056367 Number of primitive (period n) bracelet structures using exactly three different colored beads.
 * @author Sean A. Irvine
 */
public class A056367 extends A056362 {

  private final Sequence mA = new A000046();
  {
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
