package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082388 a(1) = 1, a(2) = 2; further terms are defined by rules that for k &gt;= 2, a(2^k-i) = a(2^k+i) for 1 &lt;= i &lt;= 2^k-1 and a(2^k) = a(2^(k-1)) + Sum_{i &lt; 2^k} a(i).
 * @author Sean A. Irvine
 */
public class A082388 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int e = Functions.VALUATION.i(++mN, 2);
    return Integers.SINGLETON.sum(0, e / 2, k -> Binomial.binomial(e, 2L * k).shiftLeft(e - k));
  }
}
