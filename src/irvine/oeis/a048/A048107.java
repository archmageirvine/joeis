package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a034.A034444;

/**
 * A048107 Numbers k such that the number of unitary divisors of k (A034444) is larger than the number of non-unitary divisors of k (A048105).
 * @author Sean A. Irvine
 */
public class A048107 extends A034444 {

  private final Sequence mA = new A048105();

  @Override
  public Z next() {
    while (true) {
      if (super.next().compareTo(mA.next()) > 0) {
        return mN;
      }
    }
  }
}
