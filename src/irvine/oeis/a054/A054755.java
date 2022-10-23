package irvine.oeis.a054;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054755 Odd powers of primes of the form q = x^2 + 1 (A002496).
 * @author Sean A. Irvine
 */
public class A054755 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeMap<Z, Z> mA = new TreeMap<>();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.firstKey().compareTo(mP) > 0) {
      mA.put(mP, mP.square());
      do {
        mP = mPrime.nextPrime(mP);
      } while (!mP.subtract(1).isSquare());
    }
    final Map.Entry<Z, Z> e = mA.pollFirstEntry();
    mA.put(e.getKey().multiply(e.getValue()), e.getValue());
    return e.getKey();
  }
}
