package irvine.oeis.a101;

import irvine.oeis.FiniteSequence;

/**
 * A101599 <code>a(n) =</code> binomial coefficient C(m,k) with minimal (m,k) and exactly n distinct digits in decimal representation.
 * @author Georg Fischer
 */
public class A101599 extends FiniteSequence {

  /** Construct the sequence. */
  public A101599() {
    super(1, 10, 126, 1287, 12870, 125970, 1352078, 84672315, 137846528820L, 6499270398159L);
  }
}
