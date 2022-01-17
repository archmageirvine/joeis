package irvine.oeis.a053;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Pair;

/**
 * A053810 Prime powers of prime numbers.
 * @author Sean A. Irvine
 */
public class A053810 extends A000040 {

  private final TreeMap<Z, Pair<Long, Long>> mA = new TreeMap<>();
  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      if (mA.isEmpty() || mA.firstKey().compareTo(mP) > 0) {
        mA.put(mP, new Pair<>(mP.longValueExact(), 1L));
        mP = super.next();
      }
      final Map.Entry<Z, Pair<Long, Long>> e = mA.pollFirstEntry();
      final long p = e.getValue().left();
      final long exponent = e.getValue().right();
      mA.put(e.getKey().multiply(p), new Pair<>(p, exponent + 1));
      if (mPrime.isPrime(exponent)) {
        return e.getKey();
      }
    }
  }
}

