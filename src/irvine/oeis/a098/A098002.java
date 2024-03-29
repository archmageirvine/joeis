package irvine.oeis.a098;
// Generated by gen_seq4.pl sumdiv at 2023-04-05 22:33

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A098002 Sum of squares of distinct prime divisors p of n, where each p &lt;= sqrt(n).
 * @author Georg Fischer
 */
public class A098002 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A098002() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf((Z.valueOf(d).isProbablePrime() && (d * d <= mN)) ? (long) d * d : 0));
  }
}
