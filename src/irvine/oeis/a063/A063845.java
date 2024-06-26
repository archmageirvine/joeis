package irvine.oeis.a063;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A063845 a(n) = sigma(usigma(n)), where usigma(n) is the sum of unitary divisors of n (A034448) and sigma(n) is the sum of the divisors (A000203).
 * @author Georg Fischer
 */
public class A063845 extends LambdaSequence {

  /** Construct the sequence. */
  public A063845() {
    super(1, n -> Functions.SIGMA.z(1, Functions.USIGMA1.z(n)));
  }
}
