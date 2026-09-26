package irvine.oeis.a079;
// manually 2026-09-25

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a185.A185633;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A079612 Largest number m such that a^n == 1 (mod m) whenever a is coprime to m.
 * @author Georg Fischer
 */
public class A079612 extends SingleTransformSequence implements DirectSequence {

  /** Construct the sequence. */
  public A079612() {
    super(1, (term, n) -> term.multiply(Z.TWO.subtract(Functions.PARITY.z(n))), "", new A185633());
  }

  @Override
  public Z a(final Z n) {
    final Z term = n.testBit(0) ? Z.TWO : Functions.BERNOULLI.q(n).divide(n).den();
    return term.multiply(Z.TWO.subtract(Functions.PARITY.z(n)));
  }

  @Override
  public Z a(final long n) {
    final Z term = (n & 1) == 1 ? Z.TWO : Functions.BERNOULLI.q(n).divide(n).den();
    return term.multiply(Z.TWO.subtract(Functions.PARITY.z(n)));
  }
}
