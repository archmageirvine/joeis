package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055280 Number of rooted trees with n nodes and 5 leaves.
 * @author Georg Fischer
 */
public class A055280 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055280() {
    super(6, A055278.computeRecurrence(5), "1, 5, 21, 72, 214, 563, 1344, 2958, 6086, 11820, 21854, 38713, 66069, 109109, 175019", 0);
  }
}

