package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037809 Number of i such that d(i)&lt;=d(i-1), where Sum{d(i)*2^i: i=0,1,...,m} is the base 2 representation of n.
 * @author Sean A. Irvine
 */
public class A037809 implements Sequence {

  private long mN = 0;

  protected long base() {
    return 2;
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
      if (b <= a) {
        ++cnt;
      }
      a = b;
    }
    return Z.valueOf(cnt);
  }
}
