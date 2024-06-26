package irvine.oeis.a308;
// Generated by gen_seq4.pl 2024-05-25/multraf at 2024-05-25 23:20

import irvine.math.z.Z;
import irvine.oeis.a000.A000225;
import irvine.oeis.a020.A020639;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A308480 a(n) = A000225(n) if n is prime, a(n) = A020639(n) otherwise.
 * @author Georg Fischer
 */
public class A308480 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A308480() {
    super(2, (self, n) -> Z.valueOf(n).isProbablePrime() ? self.s(0) : self.s(1), "", new A000225(), new A020639());
  }
}
