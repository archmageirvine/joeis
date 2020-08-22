package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a008.A008836;

/**
 * A028260 Numbers n such that number of prime divisors of n (counted with multiplicity) is even; Liouville function lambda(n) (A008836) is positive.
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
