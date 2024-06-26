package irvine.oeis.a187;
// Generated by gen_seq4.pl sumdiv3/sumdiv at 2023-04-11 14:46

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A187793 Sum of the deficient divisors of n.
 * @author Georg Fischer
 */
public class A187793 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A187793() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> d == 1 || Functions.SIGMA1.z(d).compareTo(2L * d) < 0 ? Z.valueOf(d) : Z.ZERO);
  }
}
