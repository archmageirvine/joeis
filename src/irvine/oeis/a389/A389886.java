package irvine.oeis.a389;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A389886 allocated for Julian Allagan.
 * @author Sean A. Irvine
 */
public class A389886 extends Sequence3 {

  // a(n) = Sum_{t=2..n-1} a_{n-1,t} * (2^(t-1) - 1) where a_{m,t} = C(m-t,t-1) + 2*C(m-t-1,t-1) + C(m-t-2,t-1).
  /*


a[m_, t_] := Binomial[m-t, t-1] + 2*Binomial[m-t-1, t-1] + Binomial[m-t-2, t-1];

Table[Sum[a[n-1, t]*StirlingS2[t, 2], {t, 2, n-1}], {n, 3, 32}]

   */

  private int mN = 1;

  private Z t(final int m, final int t) {
    final Z res = Binomial.binomial(m - t, t - 1).add(Binomial.binomial(m - t - 1, t - 1).multiply2()).add(Binomial.binomial(m - t - 2, t - 1));
    System.out.println("m=" + m + " t=" + t + " --> " + res);
    return res;
  }

  @Override
  public Z next() {
//    return Integers.SINGLETON.sum(2, ++mN, k -> t(mN, k).multiply(Functions.STIRLING2.z(k, 2)));
    return Integers.SINGLETON.sum(2, ++mN, k -> t(mN, k).multiply(Z.ONE.shiftLeft(k - 1).subtract(1)));
  }
}

