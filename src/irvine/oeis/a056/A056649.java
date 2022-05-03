package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056649 Number of non-unitary square divisors of central binomial coefficient.
 * @author Sean A. Irvine
 */
public class A056649 extends A056061 {

  private final Sequence mA = new A056648();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
