package irvine.oeis.a080;
// manually 2021-05-23

import irvine.oeis.HolonomicRecurrence;

/**
 * A080047 Operation count to create all permutations of n distinct elements using Algorithm L (lexicographic permutation generation) from Knuth's The Art of Computer Programming, Vol. 4, chapter 7.2.1.2. Sequence gives number of times l has to be repeatedly decreased in step L3.
 * @author Georg Fischer
 */
public class A080047 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A080047() {
    super(2, "[[2,-3, 1],[0, 2],[-2]]", "0, 1, 7, 41, 256", 0);
  }
}
