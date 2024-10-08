package irvine.oeis.a293;
// Generated by gen_seq4.pl 2024-09-21.ack/lambdan at 2024-09-21 22:07

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A293418 a(n) is the greatest integer k such that k/Fibonacci(n) &lt; sqrt(2).
 * @author Georg Fischer
 */
public class A293418 extends LambdaSequence {

  /** Construct the sequence. */
  public A293418() {
    super(0, n -> CR.SQRT2.multiply(Functions.FIBONACCI.z(n)).floor());
  }
}
