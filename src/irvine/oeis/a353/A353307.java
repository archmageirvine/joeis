package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-06-01/lambdan at 2024-06-01 22:47

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a156.A156552;

/**
 * A353307 a(n) = 1 if A156552(n) == 1 (mod 3), otherwise 0.
 * @author Georg Fischer
 */
public class A353307 extends LambdaSequence {

  private static final DirectSequence A156552 = new A156552();

  /** Construct the sequence. */
  public A353307() {
    super(1, n -> A156552.a(2 * n).mod(3) == 0 ? Z.ONE : Z.ZERO);
  }
}
