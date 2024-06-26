package irvine.oeis.a246;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.a000.A000045;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A246558 Product of the digits of the n-th Fibonacci number.
 * @author Georg Fischer
 */
public class A246558 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A246558() {
    super(0, new A000045(), v -> Functions.DIGIT_PRODUCT.z(v));
  }
}
