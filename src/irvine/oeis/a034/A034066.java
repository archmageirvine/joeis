package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034066 Decimal part of a(n)^(1/11) starts with n (11th powers excluded).
 * @author Sean A. Irvine
 */
public class A034066 implements Sequence {

  private static final CR C = CR.valueOf(new Q(1, 11));
  private long mN = -1;
  private long mT = 10;

  @Override
  public Z next() {
    if (++mN == mT) {
      mT *= 10L;
    }
    if (mN == 0) {
      return Z.TWO;
    }
    Z m = Z.ONE;
    while (true) {
      m = m.add(1);
      if (ComputableReals.SINGLETON.pow(CR.valueOf(m), C).frac().multiply(mT).floor().longValueExact() == mN) {
        return m;
      }
    }
  }
}

