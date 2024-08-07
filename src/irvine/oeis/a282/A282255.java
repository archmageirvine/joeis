package irvine.oeis.a282;
// Generated by gen_seq4.pl 2024-07-26/sintrif at 2024-07-27 00:11

import irvine.oeis.a069.A069789;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A282255 Least k &gt; 0 such that sigma(n) divides sigma(n+k).
 * @author Georg Fischer
 */
public class A282255 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A282255() {
    super(1, (term, n) -> term.subtract(n), "", new A069789());
  }
}
