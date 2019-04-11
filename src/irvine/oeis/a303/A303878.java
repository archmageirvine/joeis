package irvine.oeis.a303;

import irvine.oeis.FiniteSequence;

/**
 * A303878 Consider the representation of some integer <code>(&gt;1)</code> as the sum of distinct unit fraction <code>(&lt;1)</code>. The sum of these denominators is least.
 * @author Georg Fischer
 */
public class A303878 extends FiniteSequence {

  /** Construct the sequence. */
  public A303878() {
    super(2, 3, 4, 5, 6, 8, 9, 10, 15, 18, 20, 24);
  }
}
