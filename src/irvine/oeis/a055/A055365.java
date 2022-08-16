package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055365 Number of asymmetric mobiles (circular rooted trees) with n nodes and 4 leaves.
 * @author Georg Fischer
 */
public class A055365 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055365() {
    super(6, A055278.computeRecurrence(4), "1, 5, 19, 53, 130, 280, 556, 1024, 1788, 2971, 4752, 7338", 0);
  }
}

