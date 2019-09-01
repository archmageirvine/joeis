package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025485 Number of iterations of function <code>f(k) = ceiling(sqrt(k))^2 -</code> k on n required to force <code>n &lt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A025485 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private Z f(final Z n) {
    final Z s = n.sqrt();
    if (n.auxiliary() == 1) {
      return Z.ZERO;
    }
    return s.add(1).square().subtract(n);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    Z m = mN;
    while (m.compareTo(Z.TWO) > 0) {
      m = f(m);
      ++c;
    }
    return Z.valueOf(c);
  }
}

