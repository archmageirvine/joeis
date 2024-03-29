package irvine.oeis.a348;
// Generated by gen_seq4.pl sumdiv2/sumdiv at 2023-04-10 10:08

import irvine.factor.factor.Jaguar;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A348398 a(n) = Sum_{d|n} sigma_[n/d](d), where sigma_[k](n) is the sum of the k-th powers of the divisors of n.
 * @author Georg Fischer
 */
public class A348398 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A348398() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Jaguar.factor(d).sigma(mN / d));
  }
}
