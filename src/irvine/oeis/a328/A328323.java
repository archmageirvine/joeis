package irvine.oeis.a328;
// Generated by gen_seq4.pl 2025-04-01.ack/multraf at 2025-04-01 22:10

import irvine.oeis.DirectSequence;
import irvine.oeis.a324.A324198;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A328323 a(n) = gcd(A328316(n),A328316(1+n)).
 * @author Georg Fischer
 */
public class A328323 extends MultiTransformSequence {

  private static final DirectSequence A324198 = new A324198();

  /** Construct the sequence. */
  public A328323() {
    super(0, (self, n) -> A324198.a(self.s(0)), "", new A328316());
  }
}
