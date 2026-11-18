package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000040;

/**
 * A087454 Multiplicative inverse of the n-th prime prime(n) modulo prime(n-1).
 * @author Sean A. Irvine
 */
public class A087454 extends Sequence2 {

  private final Sequence mPrimes = new A000040();
  private Z mP = mPrimes.next();

  @Override
  public Z next() {
    final Z q = mP;
    mP = mPrimes.next();
    return mP.modInverse(q);
  }
}
