package irvine.oeis.a111;
// Generated by gen_seq4.pl 2024-06-24/sintrif at 2024-06-24 23:40

import irvine.math.z.Z;
import irvine.oeis.a002.A002084;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A111196 a(n) = 2^(-n)*Sum_{k=0..n} binomial(2*n+1, 2*k+1)*A000364(n-k).
 * @author Georg Fischer
 */
public class A111196 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A111196() {
    super(0, (term, n) -> term.divide(Z.TWO.pow(n)), "", new A002084());
  }
}
