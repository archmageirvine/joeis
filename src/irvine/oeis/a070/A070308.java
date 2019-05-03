package irvine.oeis.a070;

import irvine.oeis.FiniteSequence;

/**
 * A070308 "Canada perfect numbers": n such that the sum of <code>digits^2</code> of n equals the sum of <code>d|n, 1&lt;d&lt;n</code>.
 * @author Georg Fischer
 */
public class A070308 extends FiniteSequence {

  /** Construct the sequence. */
  public A070308() {
    super(125, 581, 8549, 16999);
  }
}
