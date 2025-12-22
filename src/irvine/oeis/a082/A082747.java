package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000668;

/**
 * A082747 a(n) is the least k such that k*Mrs(n)*Mrs(n+1)*Mrs(n+2) + 1 is prime, where Mrs(n) is the n-th Mersenne prime.
 * @author Sean A. Irvine
 */
public class A082747 extends Sequence1 {

  private final Sequence mMersennePrimes = new A000668();
  private Z mA = mMersennePrimes.next();
  private Z mB = mMersennePrimes.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = mMersennePrimes.next();
    final Z prod = t.multiply(mA).multiply(mB);
    long k = 0;
    Z q = Z.ONE;
    while (true) {
      ++k;
      q = q.add(prod);
      if (q.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
