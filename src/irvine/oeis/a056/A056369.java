package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056369 Number of primitive (period n) bracelet structures using exactly five different colored beads.
 * @author Sean A. Irvine
 */
public class A056369 extends A056364 {

  private final Sequence mA = new A056363();
  {
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
