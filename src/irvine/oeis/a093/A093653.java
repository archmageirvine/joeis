package irvine.oeis.a093;
// Generated by gen_seq4.pl sumdiv2/sumdiv at 2023-04-10 10:08

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A093653 Total number of 1's in binary expansion of all divisors of n.
 * @author Georg Fischer
 */
public class A093653 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A093653() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(Integer.bitCount(d)));
  }
}
