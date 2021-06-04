package irvine.oeis.a048;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048184 Primes with nontrivial omnipower group.
 * @author Sean A. Irvine
 */
public class A048184 extends A000040 {

  private final TreeMap<Z, Z> mA = new TreeMap<>();
  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      if (mA.isEmpty() || mA.firstKey().compareTo(mP.multiply2()) > 0) {
        mA.put(mP.multiply(Z.TWO.equals(mP) ? 1 : 2), mP);
        mP = super.next();
      }
      final Map.Entry<Z, Z> e = mA.pollFirstEntry();
      mA.put(e.getKey().multiply(e.getValue()), e.getValue());
      final Z q = e.getKey().add(1);
      if (q.isProbablePrime()) {
        return q;
      }
    }
  }
}
