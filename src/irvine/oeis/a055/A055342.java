package irvine.oeis.a055;

import irvine.oeis.HolonomicRecurrence;

/**
 * A055342 Number of mobiles (circular rooted trees) with n nodes and 4 leaves.
 * @author Georg Fischer
 */
public class A055342 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055342() {
    super(5, A055278.computeRecurrence(4), "1, 4, 16, 46, 118, 260, 527, 985, 1741, 2918, 4701", 0);
  }
}

