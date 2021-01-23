package irvine.oeis.a000;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;

/**
 * A000961 Powers of primes. Alternatively, 1 and the prime powers (p^k, p prime, k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A000961 extends A000040 {

  private final TreeMap<Z, Z> mA = new TreeMap<>();
  {
    mA.put(Z.ONE, null);
  }
  private Z mP = super.next();

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.firstKey().compareTo(mP) > 0) {
      mA.put(mP, mP);
      mP = super.next();
    }
    final Map.Entry<Z, Z> e = mA.pollFirstEntry();
    if (e.getValue() != null) {
      mA.put(e.getKey().multiply(e.getValue()), e.getValue());
    }
    return e.getKey();
  }
}

