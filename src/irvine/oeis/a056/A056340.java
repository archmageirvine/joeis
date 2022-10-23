package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A056340 Number of primitive (aperiodic) reversible string structures with n beads using exactly six different colors.
 * @author Sean A. Irvine
 */
public class A056340 extends Sequence1 {

  private final Sequence mA = new A056335();
  private final Sequence mB = new A056334();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next());
  }
}
