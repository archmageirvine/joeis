package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033093 Number of 0's when n is written in base b for 2&lt;=b&lt;=n+1.
 * @author Sean A. Irvine
 */
public class A033093 implements Sequence {

  private long mN = 0;

  protected long digit() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    long c = 0;
    for (long base = 2; base <= mN + 1; ++base) {
      long m = mN;
      while (m != 0) {
        if (m % base == digit()) {
          ++c;
        }
        m /= base;
      }
    }
    return Z.valueOf(c);
  }
}
