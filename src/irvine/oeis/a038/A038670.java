package irvine.oeis.a038;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.MutableInteger;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038670 Concatenations of two squares in two ways.
 * @author Sean A. Irvine
 */
public class A038670 extends Sequence1 {

  private final TreeMap<Z, MutableInteger> mA = new TreeMap<>();
  private long mN = 1;
  private Z mS = Z.ONE;

  private void increment(final Z n) {
    final MutableInteger c = mA.get(n);
    if (c == null) {
      mA.put(n, new MutableInteger(1));
    } else {
      c.postIncrement();
    }
  }

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.firstKey().compareTo(mS) > 0) {
        mS = Z.valueOf(++mN).square();
        final String s = mS.toString();
        for (long k = 1; k <= mN; ++k) {
          final String k2 = Z.valueOf(k).square().toString();
          increment(new Z(s + k2));
          if (k != mN) {
            increment(new Z(k2 + s));
          }
        }
      }
      final Map.Entry<Z, MutableInteger> e = mA.pollFirstEntry();
      if (e.getValue().get() == 2) {
        return e.getKey();
      }
    }
  }
}
