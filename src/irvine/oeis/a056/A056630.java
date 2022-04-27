package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a055.A055993;

/**
 * A056630 Number of non-unitary square divisors of n!.
 * @author Sean A. Irvine
 */
public class A056630 extends A055993 {

  private final Sequence mA = new A056629();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
