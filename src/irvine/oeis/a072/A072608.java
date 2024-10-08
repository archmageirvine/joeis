package irvine.oeis.a072;
// Generated by gen_seq4.pl 2024-08-16.ack/parity at 2024-08-16 19:15

import irvine.math.z.Z;
import irvine.oeis.a004.A004648;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A072608 Parity of remainder Mod(prime(n),n) = A004648(n).
 * @author Georg Fischer
 */
public class A072608 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A072608() {
    super(1, (term, n) -> term.testBit(0) ? Z.ONE : Z.ZERO, new A004648());
  }
}
