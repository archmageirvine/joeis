package irvine.oeis.a337;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A337241 a(n) is the least k such that the decimal representation of k*n contains at least two digits which are the same.
 * @author Georg Fischer
 */
public class A337241 extends Sequence1 {

  private long mN = 0L;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    final Z n = Z.valueOf(mN);
    while (true) {
      ++k;
      for (final int c : ZUtils.digitCounts(n.multiply(k), 10)) {
        if (c >= 2) {
          return Z.valueOf(k);
        }
      }
    }
  }
}
