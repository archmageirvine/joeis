package irvine.oeis.a053;

import irvine.oeis.FiniteSequence;

/**
 * A053611 Numbers n such that <code>1 + 4 + 9 + </code>... <code>+ n^2 = 1 + 2 + 3 + </code>... + s for some s.
 * @author Georg Fischer
 */
public class A053611 extends FiniteSequence {

  /** Construct the sequence. */
  public A053611() {
    super(1, 5, 6, 85);
  }
}
