package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-03-06/lambdan at 2024-03-06 21:44

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A367257 a(n) = Sum_{k=0..n} binomial(n, k) * binomial(n - 1, n - k - 1) * (-n)^k.
 * @author Georg Fischer
 */
public class A367257 extends LambdaSequence {

  /** Construct the sequence. */
  public A367257() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Binomial.binomial(n - 1, n - k - 1)).multiply(Z.valueOf(-n).pow(k))));
  }
}
