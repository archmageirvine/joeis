package irvine.oeis.a356;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A356114 Number of irreducible permutations of n with partition type [2, 1, 1, ..., 1] (with &apos;1&apos; taken n - 2 times).
 * @author Georg Fischer
 */
public class A356114 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A356114() {
    super(0, "[0,2,-5,4,-1]", "0,0,0,2,9,24", 0);
  }
}
