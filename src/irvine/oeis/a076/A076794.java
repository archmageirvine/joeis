package irvine.oeis.a076;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Pair;

/**
 * A076794 Numbers of the form Sum_{k=1..m} prime(r)^prime(k) for some values of m and r.
 * @author Sean A. Irvine
 */
public class A076794 extends A000040 {

  private final TreeMap<Z, Pair<Long, Long>> mA = new TreeMap<>();
  private Z mP = super.next();

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.firstKey().compareTo(mP) > 0) {
      mA.put(mP.square(), new Pair<>(mP.longValueExact(), 2L));
      mP = super.next();
    }
    final Map.Entry<Z, Pair<Long, Long>> e = mA.pollFirstEntry();
    final long p = e.getValue().left();
    final long exponent = mPrime.nextPrime(e.getValue().right());
    mA.put(e.getKey().add(Z.valueOf(p).pow(exponent)), new Pair<>(p, exponent));
    return e.getKey();
  }
}

