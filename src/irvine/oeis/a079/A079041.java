package irvine.oeis.a079;

import irvine.oeis.FiniteSequence;

/**
 * A079041 Numbers n in which the first k digits of n form an integer divisible by <code>k^3</code>, for k <code>= 1, 2</code>, ..., m, where m is the number of digits in <code>n</code>.
 * @author Georg Fischer
 */
public class A079041 extends FiniteSequence {

  /** Construct the sequence. */
  public A079041() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 16, 24, 32, 40, 48, 56, 64, 72, 80, 88, 96, 162, 243, 324, 405, 486, 567, 648, 729, 2432, 4864, 7296);
  }
}
