package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056647 Largest unitary square divisor of central binomial coefficient.
 * @author Sean A. Irvine
 */
public class A056647 extends A056057 {

  private final Sequence mA = new A056059();

  @Override
  public Z next() {
    return super.next().divide(mA.next().square());
  }
}
