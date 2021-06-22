package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a008.A008836;

/**
 * A028260 Numbers with an even number of prime divisors (counted with multiplicity); numbers k such that the Liouville function lambda(k) (A008836) is positive.
 * @author Sean A. Irvine
 */
public class A028260 extends A008836 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().signum() > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
