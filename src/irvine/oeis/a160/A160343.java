package irvine.oeis.a160;

import irvine.oeis.FiniteSequence;

/**
 * A160343 The sequence contains numbers n such that the two closest numbers above and below n, which are in <code>A010784</code> and which have no common digit with n, have the same distance to <code>n</code>.
 * @author Georg Fischer
 */
public class A160343 extends FiniteSequence {

  /** Construct the sequence. */
  public A160343() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 89, 394, 605, 894, 3944, 6055, 8944, 15111, 84888, 89444, 894444);
  }
}
