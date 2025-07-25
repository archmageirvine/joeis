package irvine.oeis.a204;
// Generated by gen_seq4.pl 2025-06-08.ack/lambdan at 2025-06-08 23:06

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A204449 Exponential (or binomial) half-convolution of A000032 (Lucas) with itself.
 * @author Georg Fischer
 */
public class A204449 extends LambdaSequence {

  /** Construct the sequence. */
  public A204449() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 2, k -> Binomial.binomial(n, k).multiply(Functions.LUCAS.z(k)).multiply(Functions.LUCAS.z(n - k))));
  }
}
