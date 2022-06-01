package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055364 Number of asymmetric mobiles (circular rooted trees) with n nodes and 3 leaves.
 * @author Georg Fischer
 */
public class A055364 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055364() {
    super(4, A055278.computeRecurrence(3), "1, 4, 10, 22, 42, 73", 0);
  }
}

