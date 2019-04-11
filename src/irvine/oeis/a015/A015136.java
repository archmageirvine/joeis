package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015136 Consider Fibonacci-type sequences b(0)=X, b(1)=Y, b(k)=b(k-1)+b(k-2) <code>mod n</code>; all are periodic; sequence gives minimal nontrivial period length.
 * @author Sean A. Irvine
 */
public class A015136 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long min = Long.MAX_VALUE;
    for (int x = 0; x < mN; ++x) {
      for (int y = x; y < mN; ++y) {
        final long period = A015135.period(x, y, mN);
        if (period > 1) {
          min = Math.min(min, period);
        }
      }
    }
    assert min != Long.MAX_VALUE;
    return Z.valueOf(min);
  }
}
