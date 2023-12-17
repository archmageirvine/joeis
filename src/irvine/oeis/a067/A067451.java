package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067229.
 * @author Sean A. Irvine
 */
public class A067451 extends Sequence1 {

  private long mN = 0;

  private boolean is(long n) {
    long sum = 0;
    Z prod = Z.ONE;
    int cnt = 0;
    while (n != 0) {
      final long r = n % 10;
      if (r == 0) {
        return false;
      }
      sum += r;
      prod = prod.multiply(r);
      ++cnt;
      n /= 10;
    }
    return sum % cnt == 0 && prod.root(cnt).auxiliary() == 1;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
