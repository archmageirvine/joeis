package irvine.oeis.a001;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001235.
 * @author Sean A. Irvine
 */
public class A001235 implements Sequence {

  private final HashMap<Z, Integer> mCount = new HashMap<>();
  private long mN = 1728;
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
          mCount.put(u, 1 + mCount.getOrDefault(u, 0));
        }
      }
      final Integer w = mCount.get(n);
      if (w != null && w > 1) {
        return n;
      }
    }
  }
}
