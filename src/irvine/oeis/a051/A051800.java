package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A051800 Numbers k such that 1 plus twice the product of the first k primes is also a prime.
 * @author Sean A. Irvine
 */
public class A051800 extends A002110 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().multiply2().add(1).isProbablePrime() && mN > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
