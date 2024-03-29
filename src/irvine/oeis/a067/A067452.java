package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067452 Numbers, not composed of the same digits, such that the geometric and arithmetic means of their decimal digits are integers.
 * @author Sean A. Irvine
 */
public class A067452 extends Sequence1 {

  private long mN = 0;

  private boolean is(long n) {
    long sum = 0;
    Z prod = Z.ONE;
    int cnt = 0;
    int syn = 0;
    while (n != 0) {
      final long r = n % 10;
      if (r == 0) {
        return false;
      }
      syn |= 1 << r;
      sum += r;
      prod = prod.multiply(r);
      ++cnt;
      n /= 10;
    }
    return sum % cnt == 0 && Integer.bitCount(syn) > 1 && prod.root(cnt).auxiliary() == 1;
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
