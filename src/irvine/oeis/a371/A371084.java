package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-11-10.ack/lambdan at 2024-11-10 23:25

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a008.A008966;
import irvine.oeis.a359.A359550;

/**
 * A371084 a(n) = 1 if n is a nonsquarefree number not divisible by p^p for any prime p, otherwise 0.
 * @author Georg Fischer
 */
public class A371084 extends LambdaSequence {

  private static final DirectSequence A008966 = new A008966();
  private static final DirectSequence A359550 = new A359550();

  /** Construct the sequence. */
  public A371084() {
    super(1, n -> (Z.ONE.subtract(A008966.a(n))).multiply(A359550.a(n)));
  }
}
