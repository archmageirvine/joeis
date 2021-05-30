package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a034.A034444;

/**
 * A048105 Number of non-unitary divisors of n.
 * @author Sean A. Irvine
 */
public class A048105 extends A000005 {

  private final Sequence mA = new A034444();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
