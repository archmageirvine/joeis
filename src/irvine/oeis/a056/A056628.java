package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a055.A055071;
import irvine.oeis.a055.A055230;

/**
 * A056628 Largest unitary square divisor of n!.
 * @author Sean A. Irvine
 */
public class A056628 extends A055071 {

  private final Sequence mA = new A055230();

  @Override
  public Z next() {
    return super.next().divide(mA.next().square());
  }
}
