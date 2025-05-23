package irvine.oeis.a345;
// Generated by gen_seq4.pl 2025-05-11.ack/multia at 2025-05-11 22:56

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A345137 a(1) = a(2) = 1; a(n+2) = Sum_{d|n, d &lt; n} a(d).
 * @author Georg Fischer
 */
public class A345137 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A345137() {
    super(1, (self, n) -> Integers.SINGLETON.sumdiv(n - 2, d -> d == n - 2 ? Z.ZERO : self.a(d)), "1,1");
  }
}
