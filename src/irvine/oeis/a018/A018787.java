package irvine.oeis.a018;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.MutableInteger;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018787 Numbers that are the sum of two positive cubes in at least three ways <code>(all solutions)</code>.
 * @author Sean A. Irvine
 */
public class A018787 implements Sequence {

  private final TreeMap<Z, MutableInteger> mCounts = new TreeMap<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      Z n3 = mN.pow(3);
      while (mCounts.isEmpty() || mCounts.firstKey().compareTo(n3) > 0) {
        mN = mN.add(1);
        n3 = mN.pow(3);
        for (Z m = Z.ONE; m.compareTo(mN) <= 0; m = m.add(1)) {
          final Z v = n3.add(m.pow(3));
          final MutableInteger c = mCounts.get(v);
          if (c != null) {
            c.postIncrement();
          } else {
            mCounts.put(v, new MutableInteger(1));
          }
        }
      }
      final Map.Entry<Z, MutableInteger> e = mCounts.pollFirstEntry();
      if (e.getValue().get() > 2) {
        return e.getKey();
      }
    }
  }
}

