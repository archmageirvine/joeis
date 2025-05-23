package irvine.oeis.a325;
// Generated by gen_seq4.pl 2025-04-09.ack/multia at 2025-04-09 21:37

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A325212 a(1) = 1; a(n) = Sum_{d|n, d&lt;n} sigma(n/d) * a(d), where sigma = A000203.
 * @author Georg Fischer
 */
public class A325212 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A325212() {
    super(1, (self, n) -> Integers.SINGLETON.sumdiv(n, d -> d == n ? Z.ZERO : Functions.SIGMA1.z(n / d).multiply(self.a(d))), "1");
  }
}
