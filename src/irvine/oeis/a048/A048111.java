package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a034.A034444;

/**
 * A048111 Number of unitary divisors of n (A034444) &lt; number of non-unitary divisors of n (A048105).
 * @author Sean A. Irvine
 */
public class A048111 extends A034444 {

  private final Sequence mA = new A048105();

  @Override
  public Z next() {
    while (true) {
      if (super.next().compareTo(mA.next()) < 0) {
        return mN;
      }
    }
  }
}
