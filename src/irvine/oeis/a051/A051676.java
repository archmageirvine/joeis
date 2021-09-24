package irvine.oeis.a051;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051676 Composite numbers whose square has a prime number of divisors.
 * @author Sean A. Irvine
 */
public class A051676 extends A000040 {

  private final TreeMap<Z, Z> mA = new TreeMap<>();
  {
    mA.put(Z.ONE, null);
  }
  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      if (mA.isEmpty() || mA.firstKey().compareTo(mP) > 0) {
        mA.put(mP, mP);
        mP = super.next();
      }
      final Map.Entry<Z, Z> e = mA.pollFirstEntry();
      Z k = e.getKey();
      final Z v = e.getValue();
      if (v != null) {
        mA.put(k.multiply(v), v);
        if (!k.equals(v)) {
          // i.e. k is not prime
          long exp = 0;
          while (!k.equals(Z.ONE)) {
            k = k.divide(v);
            ++exp;
          }
          if (mPrime.isPrime(2 * exp + 1)) {
            return e.getKey();
          }
        }
      }
    }
  }
}
