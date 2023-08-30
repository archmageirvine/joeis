package irvine.oeis.a261;

import irvine.oeis.FiniteSequence;

/**
 * A261905 Numbers m with the property that there is no number k in the range ceiling(sqrt(3m)) &lt;= k &lt;= floor(sqrt(4m)) with k == m (mod 2).
 * @author Georg Fischer
 */
public class A261905 extends FiniteSequence {

  /** Construct the sequence. */
  public A261905() {
    super(1, FINITE, 1, 2, 5, 6, 8, 9, 11, 14, 17, 19, 22, 24, 29, 34, 41);
  }
}
