package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-06-13/lambdan at 2024-06-14 00:04

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A367332 a(n) = 27^n * Sum_{k=0..n} binomial(1/3, k)^2.
 * @author Georg Fischer
 */
public class A367332 extends LambdaSequence {

  /** Construct the sequence. */
  public A367332() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> Binomial.binomial(new Q(1, 3), k).square().multiply(Z.valueOf(27).pow(n))).num());
  }
}
