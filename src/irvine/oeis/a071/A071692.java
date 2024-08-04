package irvine.oeis.a071;

import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071692 Number of ways to write n as n = x! + y! + z! where 0&lt;=x&lt;=y&lt;=z&lt;=n.
 * @author Sean A. Irvine
 */
public class A071692 extends Sequence0 {

  private final TreeMap<Long, Integer> mCounts = new TreeMap<>();
  private int mT = 0;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN >= mT) {
      final long tf = Functions.FACTORIAL.l(mT);
      if (mN > tf) {
        for (int x = 0; x <= mT; ++x) {
          final long xf = tf + Functions.FACTORIAL.l(x);
          for (int y = 0; y <= x; ++y) {
            final long yf = xf + Functions.FACTORIAL.l(y);
            mCounts.merge(yf, 1, Integer::sum);
          }
        }
        ++mT;
      }
    }
    final Integer cnt = mCounts.remove(mN);
    return cnt == null ? Z.ZERO : Z.valueOf(cnt);
  }
}
