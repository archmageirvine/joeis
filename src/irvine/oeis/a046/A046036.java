package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a019.A019519;

/**
 * A046036 Indices of the concatenation of the first n odd numbers (A019519) which are primes.
 * @author Sean A. Irvine
 */
public class A046036 extends A019519 {

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
