package irvine.oeis.a341;
// Generated by gen_seq4.pl sumdiv at 2023-04-05 22:33

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A341594 Number of strictly superior odd divisors of n.
 * @author Georg Fischer
 */
public class A341594 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A341594() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf((d & 1) * ((d > mN / d) ? 1 : 0)));
  }
}
