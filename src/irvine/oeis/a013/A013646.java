package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a003.A003285;

/**
 * A013646 Least m such that the continued fraction for sqrt(m) has period n.
 * @author Sean A. Irvine
 */
public class A013646 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final A003285 periods = new A003285();
    long m = 1;
    final Z n = Z.valueOf(++mN);
    while (!n.equals(periods.next())) {
      ++m;
    }
    return Z.valueOf(m);
  }
}
