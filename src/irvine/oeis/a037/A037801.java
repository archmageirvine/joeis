package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037801.
 * @author Sean A. Irvine
 */
public class A037801 implements Sequence {

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
        ++cnt;
      }
      a = b;
    }
    return Z.valueOf(cnt);
  }
}
