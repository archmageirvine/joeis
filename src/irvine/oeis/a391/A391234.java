package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391234 Diagonal of the 3-dimensional geode array: a(n) = G(n,n,n).
 * @author Sean A. Irvine
 */
public class A391234 extends Sequence0 {

  private long mN = -1;

  private Z c(final long m2, final long m3, final long m4) {
    final long s = m2 + m3 + m4;
    final long l = m2 + 2 * m3 + 3 * m4 + 1;
    return Functions.FACTORIAL.z(s + l - 1)
      .divide(Functions.FACTORIAL.z(l))
      .divide(Functions.FACTORIAL.z(m2))
      .divide(Functions.FACTORIAL.z(m3))
      .divide(Functions.FACTORIAL.z(m4));
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN, k -> Integers.SINGLETON.sum(0, mN, j -> Z.NEG_ONE.pow(k + j).multiply(Binomial.binomial(k + j, k)).multiply(c(mN + 1 + k + j, mN - k, mN - j))));
  }
}
