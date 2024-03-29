package irvine.oeis.a227;
// Generated by gen_seq4.pl sumdiv2/sumdiv at 2023-04-10 10:08

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A227873 Sum of odious divisors of n. See A000069 for odious numbers.
 * @author Georg Fischer
 */
public class A227873 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A227873() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf((long) (Integer.bitCount(d) & 1) * d));
  }
}
