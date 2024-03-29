package irvine.oeis.a163;
// Generated by gen_seq4.pl sumdiv2/sumdiv at 2023-04-10 10:08

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A163671 Expansion of Sum_( x^k / (1 - x^(k^2)) ).
 * @author Georg Fischer
 */
public class A163671 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A163671() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> ((mN - d) % (d * d) == 0) ? Z.ONE : Z.ZERO);
  }
}
