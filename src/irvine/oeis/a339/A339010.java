package irvine.oeis.a339;
// Generated by gen_seq4.pl sumdiv3/sumdiv at 2023-04-11 14:46

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A339010 a(n) is the number of ways to write n as the difference of two centered k-gonal numbers for k &gt;= 3.
 * @author Georg Fischer
 */
public class A339010 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A339010() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> (3 * d <= mN) ? Functions.SIGMA0.z(d >> Functions.VALUATION.i(d, 2)) : Z.ZERO);
  }
}
