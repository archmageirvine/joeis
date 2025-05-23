package irvine.oeis.a201;
// Generated by gen_seq4.pl 2024-12-23.ack/filter at 2024-12-23 23:24

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A201055 Composite numbers whose product of digits is 6.
 * @author Georg Fischer
 */
public class A201055 extends FilterSequence {

  /** Construct the sequence. */
  public A201055() {
    super(1, new A002808(), v -> Functions.DIGIT_PRODUCT.l(v) == 6);
  }
}
