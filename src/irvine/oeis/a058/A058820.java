package irvine.oeis.a058;
// Generated by gen_seq4.pl build/simple at 2022-06-14 21:39

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058820 a(0) = 1, a(1) = 5; for n &gt;= 2 a(n) is the number of degree-n monic reducible polynomials over GF(5), i.e., a(n) = 5^n - A001692(n).
 * @author Georg Fischer
 */
public class A058820 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN <= 1 ? Z.FIVE.pow(mN) : Z.FIVE.pow(mN).subtract(Integers.SINGLETON.sumdiv(mN, d -> Z.FIVE.pow(mN / d).multiply(Functions.MOBIUS.i(d))).divide(mN));
  }
}
