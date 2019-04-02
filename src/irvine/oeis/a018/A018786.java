package irvine.oeis.a018;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.MutableInteger;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018786 Numbers that are the sum of two 4th powers in more than one way.
 * @author Sean A. Irvine
 */
public class A018786 implements Sequence {

  private final TreeMap<Z, MutableInteger> mCounts = new TreeMap<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      Z n4 = mN.pow(4);
      while (mCounts.isEmpty() || mCounts.firstKey().compareTo(n4) > 0) {
        mN = mN.add(1);
        n4 = mN.pow(4);
        for (Z m = Z.ONE; m.compareTo(mN) <= 0; m = m.add(1)) {
          final Z v = n4.add(m.pow(4));
          final MutableInteger c = mCounts.get(v);
          if (c != null) {
            c.postIncrement();
          } else {
            mCounts.put(v, new MutableInteger(1));
          }
        }
      }
      final Map.Entry<Z, MutableInteger> e = mCounts.pollFirstEntry();
      if (e.getValue().get() > 1) {
        return e.getKey();
      }
    }
  }
}

