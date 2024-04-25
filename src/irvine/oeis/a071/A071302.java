package irvine.oeis.a071;
// manually 2024-04-18/lambdan at 2024-04-20 18:12

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A071302 a(n) = (1/2) * (number of n X n 0..2 matrices M with MM' mod 3 = I, where M' is the transpose of M and I is the n X n identity matrix).
 * where M&apos; is the transpose of M and I is the n X n identity matrix).
 * @author Georg Fischer
 */
public class A071302 extends LambdaSequence {

  /** Construct the sequence. */
  public A071302() {
    this(1, 3);
  }

  /**
   * Generic constructor with parameter.
   * @param offset first index
   * @param base in the formula, for example 7 in A071306:
   */
  public A071302(final int offset, final int base) {
    super(offset, n -> {
      final Z baze = Z.valueOf(base);
      final int k = n / 2;
      return baze.pow(k).add((n & 1) == 1
        ? Z.ZERO
        : Z.NEG_ONE.pow(k + 1)).multiply(
        Integers.SINGLETON.product((n & 1) == 0 ? 1 : 0, k - 1, i -> baze.pow(2 * k).subtract(baze.pow(2 * i))));
    });
  }
}
