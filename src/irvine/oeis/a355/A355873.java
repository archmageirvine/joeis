package irvine.oeis.a355;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A355873 a(n) is the smallest positive exponent k such that the decimal expansion of n^k has at least one digit that occurs more than once.
 * @author Georg Fischer
 */
public class A355873 extends Sequence1 {

  private long mN = 1L;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    Z n = Z.ONE;
    while (true) {
      ++k;
      n = n.multiply(mN); // mN^k
      for (final int c : ZUtils.digitCounts(n, 10)) {
        if (c >= 2) {
          return Z.valueOf(k);
        }
      }
    }
  }
}
