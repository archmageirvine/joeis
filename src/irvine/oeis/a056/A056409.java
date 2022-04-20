package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056409 Number of primitive (aperiodic) step shifted (decimated) sequence structures using exactly five different symbols.
 * @author Sean A. Irvine
 */
public class A056409 implements Sequence {

  private final Sequence mA = new A056404();
  private final Sequence mB = new A056403();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next());
  }
}
