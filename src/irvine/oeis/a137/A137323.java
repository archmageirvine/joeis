package irvine.oeis.a137;
// Generated by gen_seq4.pl sumdiv2/sumdiv at 2023-04-10 10:08

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A137323 a(n) = sum(d divides n,  2^(n/d-1) - 1 ), omitting d=1 and d=n.
 * @author Georg Fischer
 */
public class A137323 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A137323() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> (d == 1 || d == mN) ? Z.ZERO : Z.ONE.shiftLeft(mN / d - 1).subtract(1));
  }
}
