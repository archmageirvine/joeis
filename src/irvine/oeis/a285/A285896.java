package irvine.oeis.a285;
// Generated by gen_seq4.pl sumdiv at 2023-04-05 22:33

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A285896 Sum of divisors d of n such that n/d is not congruent to 0 mod 5.
 * @author Georg Fischer
 */
public class A285896 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A285896() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> ((mN / d) % 5 != 0) ? Z.valueOf(d) : Z.ZERO);
  }
}
