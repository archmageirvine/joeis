package irvine.oeis.a001;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001239.
 * @author Sean A. Irvine
 */
public class A001239 implements Sequence {

  private final HashMap<Z, Integer> mCount = new HashMap<>();
  private long mN = 215;
  private Z mC = Z.ONE;
  private long mS = 1;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      while (n.compareTo(mC) > 0) {
        ++mS;
        mC = Z.valueOf(mS).pow(3);
        for (long k = 0; k <= mS; ++k) {
          final Z u = mC.add(Z.valueOf(k).pow(3));
          for (long j = 0; j <= k; ++j) {
            final Z v = u.add(Z.valueOf(j).pow(3));
            mCount.put(v, 1 + mCount.getOrDefault(v, 0));
          }
        }
      }
      final Integer w = mCount.get(n);
      if (w != null && w > 1) {
        return n;
      }
    }
  }
}
