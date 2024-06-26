package irvine.oeis.a255;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A255743 a(1) = 1; for n &gt; 1, a(n) = 9*8^{A000120(n-1)-1}.
 * @author Georg Fischer
 */
public class A255743 extends LambdaSequence {

  /** Construct the sequence. */
  public A255743() {
    super(1, n -> n == 1 ? Z.ONE : Z.EIGHT.pow(Integer.bitCount(n - 1) - 1).multiply(9));
  }
}
