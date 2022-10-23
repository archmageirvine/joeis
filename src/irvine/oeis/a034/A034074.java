package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034074 a(0)=2; a(n) is the smallest k &gt; a(n-1) such that the fractional part of k^(1/9) starts with n.
 * @author Sean A. Irvine
 */
public class A034074 extends Sequence0 {

  private static final CR C = CR.valueOf(new Q(1, 9));
  private long mN = -1;
  private long mT = 10;
  private Z mM = Z.ONE;

  @Override
  public Z next() {
    if (++mN == mT) {
      mT *= 10L;
    }
    while (true) {
      mM = mM.add(1);
      if (ComputableReals.SINGLETON.pow(CR.valueOf(mM), C).frac().multiply(mT).floor().longValueExact() == mN) {
        return mM;
      }
    }
  }
}

