package irvine.oeis.a035;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035046 Numbers with two representations as cube + fifth power.
 * @author Sean A. Irvine
 */
public class A035046 extends Sequence1 {

  private final TreeMap<Z, Long> mMap = new TreeMap<>();
  private long mA = 1;
  private long mB = 1;
  private Z mA3 = Z.ONE;
  private Z mB5 = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      while (mMap.isEmpty() || mMap.firstKey().compareTo(mA3) >= 0) {
        for (long b = 0; b < mB; ++b) {
          final Z n = mA3.add(Z.valueOf(b).pow(5));
          final Long c = mMap.get(n);
          mMap.put(n, c == null ? 1 : c + 1);
        }
        mA3 = Z.valueOf(++mA).pow(3);
      }
      if (mMap.firstKey().compareTo(mB5) >= 0) {
        for (long a = 0; a < mA; ++a) {
          final Z n = mB5.add(Z.valueOf(a).pow(3));
          final Long c = mMap.get(n);
          mMap.put(n, c == null ? 1 : c + 1);
        }
        mB5 = Z.valueOf(++mB).pow(5);
      }
      final Map.Entry<Z, Long> e = mMap.pollFirstEntry();
      if (e.getValue() == 2) {
        return e.getKey();
      }
    }
  }
}
