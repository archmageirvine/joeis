package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a173.A173018;

/**
 * A007338 Multiplicative encoding of the Eulerian number triangle.
 * @author Sean A. Irvine
 */
public class A007338 implements Sequence {

  private final Fast mPrime = new Fast();
  private final A173018 mEulerian = new A173018();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    Z p = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      p = mPrime.nextPrime(p);
      prod = prod.multiply(p.pow(mEulerian.next()));
    }
    return prod;
  }
}
