package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000007;

/**
 * A056406 Number of primitive (aperiodic) step shifted (decimated) sequence structures using exactly two different symbols.
 * @author Sean A. Irvine
 */
public class A056406 implements Sequence {

  private final Sequence mA = new A056401();
  private final Sequence mB = new A000007();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next());
  }
}
