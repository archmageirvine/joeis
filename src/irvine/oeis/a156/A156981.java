package irvine.oeis.a156;

import irvine.oeis.FiniteSequence;

/**
 * A156981 Numbers n with property that <code>n^2</code> and <code>(n+1)^2</code> have no common digits.
 * @author Georg Fischer
 */
public class A156981 extends FiniteSequence {

  /** Construct the sequence. */
  public A156981() {
    super(0, 1, 2, 3, 4, 5, 6, 8, 14, 19, 22, 29, 44, 77, 94, 264, 1414, 5477);
  }
}
