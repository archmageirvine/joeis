package irvine.oeis.a369;
// Generated by gen_seq4.pl 2024-07-01/lambdan at 2024-07-01 18:26

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a002.A002620;

/**
 * A369059 a(0) = 0, and for n &gt; 0, a(n) is the square of the product of first n-1 odd primes.
 * @author Georg Fischer
 */
public class A369059 extends LambdaSequence {

  private static final DirectSequence A002620 = new A002620();

  /** Construct the sequence. */
  public A369059() {
    super(0, n -> A002620.a(Functions.PRIMORIAL_COUNT.z(n)));
  }
}
