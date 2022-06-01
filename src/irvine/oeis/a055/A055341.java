package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055341 Number of mobiles (circular rooted trees) with n nodes and 3 leaves.
 * @author Georg Fischer
 */
public class A055341 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055341() {
    super(4, A055278.computeRecurrence(3), "1, 3, 8, 19, 37", 0);
  }
}

