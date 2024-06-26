package irvine.oeis.a345;
// Generated by gen_seq4.pl sumdiv2/sumdiv at 2023-04-10 10:08

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A345315 a(n) = Sum_{d|n} d^[Omega(d) = 2], where [ ] is the Iverson bracket.
 * @author Georg Fischer
 */
public class A345315 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A345315() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf((Functions.BIG_OMEGA.l(d) == 2) ? d : 1));
  }
}
