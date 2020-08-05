package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034059 Decimal part of <code>a(n)^(1/4)</code> starts with <code>n (4th</code> powers excluded).
 * @author Sean A. Irvine
 */
public class A034059 implements Sequence {

  private static final CR QUARTER = CR.valueOf(Q.ONE_QUARTER);
  private long mN = -1;
  private long mT = 10;

  @Override
  public Z next() {
    if (++mN == mT) {
      mT *= 10L;
    }
    if (mN == 0) {
      return Z.valueOf(17);
    }
    Z m = Z.ONE;
    while (true) {
      m = m.add(1);
      if (ComputableReals.SINGLETON.pow(CR.valueOf(m), QUARTER).frac().multiply(mT).floor().longValueExact() == mN) {
        return m;
      }
    }
  }
}

