package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034072 Decimal part of <code>a(n)^(1/7)</code> starts with n so that <code>a(n) &lt; a(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A034072 implements Sequence {

  private static final CR C = CR.valueOf(new Q(1, 7));
  private long mN = -1;
  private long mT = 10;
  private Z mM = Z.valueOf(128);

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

