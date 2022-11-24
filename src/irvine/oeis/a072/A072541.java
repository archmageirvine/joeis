package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a023.A023200;

/**
 * A072541 List of pairs of numbers (k, k+4), where k-1 and k+3 are primes.
 * a(2*n-1) = A023200(n)+1, a(2*n) = A023200(n)+5.
 * @author Georg Fischer
 */
public class A072541 extends A023200 {

  private int mN = 0;
  private Z mA;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 1) {
      mA = super.next().add(1);
    } else {
      mA = mA.add(4);
    }
    return mA;
  }
}
