package irvine.oeis.a072;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A072379 Sum_{k&lt;=n} (sigma(k)^2), where sigma(k) denotes the sum of the divisors of k A000203.
 * @author Georg Fischer
 */
public class A072379 extends LambdaSequence {

  /** Construct the sequence. */
  public A072379() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.SIGMA1.z(k).square()));
  }
}
