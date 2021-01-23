package irvine.oeis.a246;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A246547 Prime powers p^e where p is a prime and e &gt;= 2 (prime powers without the primes or 1).
 * @author Sean A. Irvine
 */
public class A246547 extends A000040 {

  private final TreeMap<Z, Z> mA = new TreeMap<>();
  private Z mP = super.next();
  private Z mPP = mP.square();

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.firstKey().compareTo(mPP) > 0) {
      mA.put(mPP, mP);
      mP = super.next();
      mPP = mP.square();
    }
    final Map.Entry<Z, Z> e = mA.pollFirstEntry();
    mA.put(e.getKey().multiply(e.getValue()), e.getValue());
    return e.getKey();
  }
}
