package irvine.oeis.a325;
// Generated by gen_seq4.pl sumdiv3/sumdiv at 2023-04-11 14:46

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A325029 a(n) = Sum_{d|n} (sigma(d)*pod(d)) where sigma(k) = the sum of the divisors of k (A000203) and pod(k) = the product of the divisors of k (A007955).
 * @author Georg Fischer
 */
public class A325029 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A325029() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Jaguar.factor(d).pod().multiply(Functions.SIGMA1.z(d)));
  }
}
