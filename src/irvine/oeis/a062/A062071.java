package irvine.oeis.a062;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062071 a(n) = [n/1] + [n/(2^2)] + [n/(3^3)] + [n/(4^4)] + ... + [n/(k^k)] + ..., up to infinity, where [ ] is the floor function.
 * @author Sean A. Irvine
 */
public class A062071 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    long k = 0;
    while (true) {
      ++k;
      final long t = mN / LongUtils.pow(k, k);
      if (t == 0) {
        break;
      }
      sum += t;
    }
    return Z.valueOf(sum);
  }
}
