package irvine.oeis.a055;

import irvine.oeis.HolonomicRecurrence;

/**
 * A055337 Number of asymmetric (identity) trees with n nodes and 6 leaves.
 * @author Georg Fischer
 */
public class A055337 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055337() {
    super(7, A055278.computeRecurrence(6), "6, 25, 90, 244, 591, 1273, 2566, 4822, 8654, 14836, 24566, 39352, 61389, 93357, 139008, 202865, 290976, 410584, 571094, 783583, 1062145, 1423226, 1887252, 2477916, 3224154, 4159173", 0);
  }
}

