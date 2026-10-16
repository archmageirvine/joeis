package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A034968 Minimal number of factorials that add to n.
 * @author Sean A. Irvine
 */
public class A034968 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    long s = n;
    for (long k = 2, f = 2; f <= n; f *= ++k) {
      s -= (k - 1) * (n / f);
    }
    return Z.valueOf(s);
  }

}
