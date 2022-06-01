package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055343 Number of mobiles (circular rooted trees) with n nodes and 5 leaves.
 * @author Georg Fischer
 */
public class A055343 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055343() {
    super(6, A055278.computeRecurrence(5), "1, 5, 25, 96, 300, 811, 1951, 4293, 8782, 16917, 30973, 54302, 91696, 149856, 237936, 368234", 0);
  }
}

