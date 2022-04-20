package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056410 Number of primitive (aperiodic) step shifted (decimated) sequence structures using exactly six different symbols.
 * @author Sean A. Irvine
 */
public class A056410 implements Sequence {

  private final Sequence mA = new A056405();
  private final Sequence mB = new A056404();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next());
  }
}
