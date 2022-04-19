package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056337 Number of primitive (aperiodic) reversible string structures with n beads using exactly three different colors.
 * @author Sean A. Irvine
 */
public class A056337 implements Sequence {

  private final Sequence mA = new A056332();
  private final Sequence mB = new A056331();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next());
  }
}
