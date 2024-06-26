package irvine.oeis.a137;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A137341 a(n) = n! * A000110(n) where A000110 is the sequence of Bell numbers.
 * a(n)=n!*bell(n)
 * @author Georg Fischer
 */
public class A137341 extends LambdaSequence {

  /** Construct the sequence. */
  public A137341() {
    super(0, n -> Functions.FACTORIAL.z(n).multiply(Functions.BELL.z(n)));
  }
}
