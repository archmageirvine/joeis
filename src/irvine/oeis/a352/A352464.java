package irvine.oeis.a352;
// Generated by gen_seq4.pl 2025-06-03.ack/filnum at 2025-06-03 20:14

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A352464 Numbers k whose decimal expansion ends in the product of digits of k.
 * @author Georg Fischer
 */
public class A352464 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A352464() {
    super(1, 1, k -> {
      final String ks = Integer.toString(k);
      return ks.endsWith(Functions.DIGIT_PRODUCT.z(k).toString(10));
    });
  }
}
