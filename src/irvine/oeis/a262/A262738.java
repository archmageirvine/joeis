package irvine.oeis.a262;
// Generated by gen_seq4.pl build/simple at 2022-06-14 21:39

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A262738 O.g.f. exp( Sum_{n &gt;= 1} A211419(n)*x^n/n ).
 * @author Georg Fischer
 */
public class A262738 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN, k -> Binomial.binomial(6L * (mN + 1), k).multiply(Binomial.binomial(5L * (mN + 1) - k - 2, (mN + 1) - k - 1))).divide(mN + 1);
  }
}
