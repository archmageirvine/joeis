package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056407 Number of primitive (aperiodic) step shifted (decimated) sequence structures using exactly three different symbols.
 * @author Sean A. Irvine
 */
public class A056407 implements Sequence {

  private final Sequence mA = new A056402();
  private final Sequence mB = new A056401();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next());
  }
}
