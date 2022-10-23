package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011189 Coefficients in expansion of e as Sum_{n&gt;=1} a(n)/(n*n!*(n+1)!), as found by greedy algorithm.
 * @author Sean A. Irvine
 */
public class A011189 extends Sequence1 {

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
    final Z a = value().subtract(CR.valueOf(mSum)).multiply(t).floor();
    mSum = mSum.add(new Q(a, t));
    return a;
  }
}

