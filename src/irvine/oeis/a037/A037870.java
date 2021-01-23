package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A037870 a(n) = (1/2)*Sum{|d(i)-e(i)|}, where Sum{d(i)*2^i} is base 2 representation of n and e(i) are digits d(i) in nonincreasing order, for i=0,1,...,m.
 * @author Sean A. Irvine
 */
public class A037870 implements Sequence {

  private long mN = 0;

  protected int base() {
    return 2;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long cnt = 0;
    long m = mN;
    long l = ZUtils.sortDigitsAscending(Z.valueOf(mN), base()).longValueExact();
    while (m != 0) {
      cnt += Math.abs(m % base() - l % base());
      m /= base();
      l /= base();
    }
    return Z.valueOf(cnt / 2);
  }
}
