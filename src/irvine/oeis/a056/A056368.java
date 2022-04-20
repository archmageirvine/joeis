package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056368 Number of primitive (period n) bracelet structures using exactly four different colored beads.
 * @author Sean A. Irvine
 */
public class A056368 extends A056363 {

  private final Sequence mA = new A056362();
  {
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
