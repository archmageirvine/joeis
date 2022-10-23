package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037844 Sum{d(i-1)-d(i): d(i)&lt;d(i-1), i=1,...,m}, where Sum{d(i)*3^i: i=0,1,...,m} is base 3 representation of n.
 * @author Sean A. Irvine
 */
public class A037844 extends Sequence1 {

  private long mN = 0;

  protected long base() {
    return 3;
  }

  @Override
  public Z next() {
    long cnt = 0;
    long m = ++mN;
    long a = m % base();
    m /= base();
    while (m != 0) {
      final long b = m % base();
      m /= base();
      if (b < a) {
        cnt += a - b;
      }
      a = b;
    }
    return Z.valueOf(cnt);
  }
}
