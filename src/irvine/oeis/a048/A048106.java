package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a034.A034444;

/**
 * A048106 Number of unitary divisors of n (A034444) - number of non-unitary divisors of n (A048105).
 * @author Sean A. Irvine
 */
public class A048106 extends A034444 {

  private final Sequence mA = new A048105();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
