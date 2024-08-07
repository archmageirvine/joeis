package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-07-26/lambdan at 2024-07-27 00:11

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A372117 a(n) = Product_{k=0..n} binomial(n+k, k)^k.
 * @author Georg Fischer
 */
public class A372117 extends LambdaSequence {

  /** Construct the sequence. */
  public A372117() {
    super(0, n -> Integers.SINGLETON.product(0, n, k -> Binomial.binomial(n + k, k).pow(k)));
  }
}
