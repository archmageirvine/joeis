package irvine.oeis.a153;
// Generated by gen_seq4.pl 2025-04-20.ack/filnum at 2025-04-20 22:06

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A153427 Numbers n such that phi(n)=p^2, where p is product of digits of n.
 * @author Georg Fischer
 */
public class A153427 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A153427() {
    super(1, 1, k -> Functions.PHI.z(k).equals(Functions.DIGIT_PRODUCT.z(k).square()));
  }
}
