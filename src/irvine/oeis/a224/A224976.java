package irvine.oeis.a224;
// Generated by gen_seq4.pl 2024-07-31/sintrif at 2024-07-31 22:55

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a111.A111932;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A224976 L.g.f.: log( 1 + Sum_{n&gt;=1} x^(n*(3*n-1)/2) + x^(n*(3*n+1)/2) ) = Sum_{n&gt;=1} a(n)*x^n/n.
 * @author Georg Fischer
 */
public class A224976 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A224976() {
    super(1, (term, n) -> Z.TWO.multiply(term).subtract(Functions.SIGMA1.z(n)), "", new A111932());
  }
}
