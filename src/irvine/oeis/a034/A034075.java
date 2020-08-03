package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034075 <code>a(0)=2; a(n)</code> is the smallest k <code>&gt; a(n-1)</code> such that the fractional part of <code>k^(1/10)</code> starts with <code>n</code>.
 * @author Sean A. Irvine
 */
public class A034075 implements Sequence {

  private static final CR C = CR.valueOf(new Q(1, 10));
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

