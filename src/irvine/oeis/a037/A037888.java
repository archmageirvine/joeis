package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A037888 a(n) = (1/2)*Sum_{i} |d(i) - e(i)| where Sum_{i} d(i)*2^i is the base-2 representation of n and e(i) are digits d(i) in reverse order.
 * @author Sean A. Irvine
 */
public class A037888 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  protected int base() {
    return 2;
  }

  @Override
  public Z a(final Z nz) {
    return a(nz.intValueExact());
  }

  @Override
  public Z a(final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    long cnt = 0;
    long m = n;
    long l = Functions.REVERSE.l(base(), mN);
    while (m != 0) {
      cnt += Math.abs(m % base() - l % base());
      m /= base();
      l /= base();
    }
    return Z.valueOf(cnt / 2);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
