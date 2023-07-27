package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037826 Number of i such that d(i) &gt;= d(i-1), where Sum_{i=0..m} d(i)*3^i is the base-3 representation of n.
 * @author Sean A. Irvine
 */
public class A037826 extends Sequence1 {

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
      if (b >= a) {
        ++cnt;
      }
      a = b;
    }
    return Z.valueOf(cnt);
  }
}
