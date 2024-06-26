package irvine.oeis.a139;
// Generated by gen_seq4.pl 2024-06-24/sintrif at 2024-06-24 23:40

import irvine.oeis.a000.A000668;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A139225 M(M-1)/3, where M is Mersenne prime A000668(n).
 * @author Georg Fischer
 */
public class A139225 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A139225() {
    super(1, (term, n) -> term.multiply(term.subtract(1)).divide(3), "", new A000668());
  }
}
