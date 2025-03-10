package irvine.oeis.a089;
// Generated by gen_seq4.pl 2024-10-29.ack/sintrif at 2024-10-29 23:15

import irvine.math.function.Functions;
import irvine.oeis.a037.A037225;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A089266 Rational knots of determinant 2n+1, counting chiral pairs twice.
 * @author Georg Fischer
 */
public class A089266 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A089266() {
    super(1, (term, n) -> Functions.USIGMA0.z(2 * n + 1).add(term).divide(2), "", new A037225());
  }
}
