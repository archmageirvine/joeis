package irvine.oeis.a366;
// Generated by gen_seq4.pl 2024-01-23/lambdan at 2024-01-25 00:21

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A366971 a(n) = Sum_{k=3..n} binomial(k,3) * floor(n/k).
 * @author Georg Fischer
 */
public class A366971 extends LambdaSequence {

  /** Construct the sequence. */
  public A366971() {
    super(1, n -> Integers.SINGLETON.sum(3, n, k -> Binomial.binomial(k, 3).multiply(n / k)));
  }
}
