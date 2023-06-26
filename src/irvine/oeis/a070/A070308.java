package irvine.oeis.a070;

import irvine.oeis.FiniteSequence;

/**
 * A070308 "Canada perfect numbers": n such that the sum of digits^2 of n equals the sum of d|n, 1&lt;d&lt;n.
 * @author Georg Fischer
 */
public class A070308 extends FiniteSequence {

  /** Construct the sequence. */
  public A070308() {
    super(1, FINITE, 125, 581, 8549, 16999);
  }
}
