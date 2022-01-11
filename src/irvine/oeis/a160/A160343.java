package irvine.oeis.a160;

import irvine.oeis.FiniteSequence;

/**
 * A160343 Numbers k such that the two closest numbers above and below k, which are in A010784 and which have no common digit with k, have the same distance to k.
 * @author Georg Fischer
 */
public class A160343 extends FiniteSequence {

  /** Construct the sequence. */
  public A160343() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 89, 394, 605, 894, 3944, 6055, 8944, 15111, 84888, 89444, 894444);
  }
}
