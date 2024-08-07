package irvine.oeis.a122;
// Generated by gen_seq4.pl 2024-04-25/lambdan at 2024-04-25 23:20

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A122155 Simple involution of natural numbers: List each block of (2^k)-1 numbers (from (2^k)+1 to 2^(k+1) - 1) in reverse order and fix the powers of 2.
 * @author Georg Fischer
 */
public class A122155 extends LambdaSequence {

  /** Construct the sequence. */
  public A122155() {
    super(0, n -> {
      final int m = Integer.highestOneBit(n);
      final int j = n - m;
      return (j == 0) ? Z.valueOf(n) : Z.valueOf(2L * m - j);
    });
  }
}
