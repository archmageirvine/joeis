package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011189 Coefficients in expansion of e as Sum <code>a(n)/(n*n!*(n+1)!), n=1..inf</code>, as found by greedy algorithm.
 * @author Sean A. Irvine
 */
public class A011189 implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;
  private Q mSum = Q.ZERO;

  protected CR value() {
    return CR.E;
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN).multiply(mN);
    }
    final Z t = mF.multiply(mN).multiply(mN + 1);
    final Z a = value().subtract(CR.valueOf(mSum)).multiply(CR.valueOf(t)).floor(32);
    mSum = mSum.add(new Q(a, t));
    return a;
  }
}

