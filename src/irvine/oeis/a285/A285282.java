package irvine.oeis.a285;

import irvine.oeis.FiniteSequence;

/**
 * A285282 Numbers n such that <code>n^2 + 1</code> is 13-smooth.
 * @author Georg Fischer
 */
public class A285282 extends FiniteSequence {

  /** Construct the sequence. */
  public A285282() {
    super(1, 2, 3, 5, 7, 8, 18, 57, 239);
  }
}
