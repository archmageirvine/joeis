package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056338 Number of primitive (aperiodic) reversible string structures with n beads using exactly four different colors.
 * @author Sean A. Irvine
 */
public class A056338 implements Sequence {

  private final Sequence mA = new A056333();
  private final Sequence mB = new A056332();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next());
  }
}
