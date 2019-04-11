package irvine.oeis.a048;

import irvine.oeis.FiniteSequence;

/**
 * A048246 Number of distinct 3-colorings (X, O and blank) of 3 X 3 grid with <code>floor((n+1)/2)</code> X's, <code>floor(n/2)</code> O's and <code>9 - n</code> blanks.
 * @author Georg Fischer
 */
public class A048246 extends FiniteSequence {

  /** Construct the sequence. */
  public A048246() {
    super(1, 3, 12, 38, 108, 174, 228, 174, 89, 23);
  }
}
