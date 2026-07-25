package irvine.oeis.a086;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086120 Natural numbers of the form p^3 - q^3, where p and q are primes.
 * @author Sean A. Irvine
 */
public class A086120 extends A000040 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP = super.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().square().multiply(6).compareTo(mP) >= 0) {
      final Z p3 = mP.pow(3);
      for (Z q = Z.TWO; q.compareTo(mP) < 0; q = mPrime.nextPrime(q)) {
        mA.add(p3.subtract(q.pow(3)));
      }
      mP = mPrime.nextPrime(mP);
    }
    return mA.pollFirst();
  }
}

