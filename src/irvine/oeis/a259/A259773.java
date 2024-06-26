package irvine.oeis.a259;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.a000.A000032;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A259773 Product of the digits of the n-th Lucas number.
 * @author Georg Fischer
 */
public class A259773 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A259773() {
    super(0, new A000032(), v -> Functions.DIGIT_PRODUCT.z(v));
  }
}
