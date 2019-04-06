package irvine.oeis.a285;

import irvine.oeis.FiniteSequence;

/**
 * A285314 Numbers k such that the k-th term of some (generalized) Lucas sequence has no primitive prime factor.
 * @author Georg Fischer
 */
public class A285314 extends FiniteSequence {

  /** Construct the sequence. */
  public A285314() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 13, 18, 30);
  }
}
