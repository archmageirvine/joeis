package irvine.oeis.a304;
// Generated by gen_seq4.pl sumdiv at 2023-04-05 22:33

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A304649 Number of divisors d|n such that neither d nor n/d is a perfect power greater than 1.
 * @author Georg Fischer
 */
public class A304649 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A304649() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> (Z.valueOf(d).isPower() == null && Z.valueOf(mN / d).isPower() == null) ? Z.ONE : Z.ZERO);
  }
}
