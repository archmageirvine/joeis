package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076537 Map positive rational numbers to positive integers by diagonal method using c(p,q) = (p + q - 2) * (p + q - 1) / 2 + p where p and q are positive integers. a(n) is an increasing sequence including all c(p,q) where gcd(p,q) &gt; 1.
 * @author Sean A. Irvine
 */
public class A076537 extends Sequence1 {

  private static final CR T = CR.valueOf(new Q(3, 2));
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    CR s;
    do {
      mA = mA.add(1);
    } while (Functions.GCD.z(mA.subtract(Binomial.binomial(CR.HALF.add(s = CR.valueOf(mA.multiply2()).sqrt()).floor(), Z.TWO)), Binomial.binomial(T.add(s).floor(), 2).subtract(mA).add(1)).equals(Z.ONE));
    return mA;
  }
}
