package irvine.oeis.a335;
// Generated by gen_seq4.pl 2024-01-20/parity at 2024-01-21 23:32

import irvine.math.z.Z;
import irvine.oeis.a323.A323173;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A335909 Parity of A323173: a(n) = A000035(A323173(n)).
 * @author Georg Fischer
 */
public class A335909 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A335909() {
    super(1, new A323173(), v -> v.testBit(0) ? Z.ONE : Z.ZERO);
  }
}
