package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A056408 Number of primitive (aperiodic) step shifted (decimated) sequence structures using exactly four different symbols.
 * @author Sean A. Irvine
 */
public class A056408 extends Sequence1 {

  private final Sequence mA = new A056403();
  private final Sequence mB = new A056402();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next());
  }
}
