package irvine.oeis.a337;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A337240 a(n) is the smallest multiple of n whose decimal representation contains at least two digits which are the same.
 * @author Georg Fischer
 */
public class A337240 extends Sequence1 {

  private long mN = 0L;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    final Z n = Z.valueOf(mN);
    while (true) {
      ++k;
      final Z t = n.multiply(k);
      final int counts[] = ZUtils.digitCounts(t, 10);
      for (int i = 0; i < 10; ++i) {
        if (counts[i] >= 2) {
          return t;
        }
      }
    }
  }
}
