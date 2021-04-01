package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a019.A019518;

/**
 * A046035 Numbers n such that the concatenation of the first n primes (A019518) is a prime.
 * @author Sean A. Irvine
 */
public class A046035 extends A019518 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
