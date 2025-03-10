package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-02-02.ack/filnum at 2025-02-02 21:39

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A379984 Numbers that are divisible by the square of the product of their digits.
 * @author Georg Fischer
 */
public class A379984 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A379984() {
    super(1, 1, k -> {
      final Z prod = Functions.DIGIT_PRODUCT.z(k);
      return !prod.isZero() && Z.valueOf(k).mod(prod.square()).isZero();
    });
  }
}
