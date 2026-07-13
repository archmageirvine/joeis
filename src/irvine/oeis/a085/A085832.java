package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085832 Smallest prime p such that both (p-1)/2^(2n-1) and 2^(2n-1)*p+1 are primes.
 * @author Sean A. Irvine
 */
public class A085832 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final Z t = Z.ONE.shiftLeft(mN);
    Z k = Z.ONE;
    while (true) {
      k = k.add(t);
      if (k.isProbablePrime() && k.subtract(1).shiftRight(mN).isProbablePrime() && k.shiftLeft(mN).add(1).isProbablePrime()) {
        return k;
      }
    }
  }
}
