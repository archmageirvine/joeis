package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055330 Number of rooted identity trees with n nodes and 5 leaves.
 * @author Georg Fischer
 */
public class A055330 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055330() {
    super(10, A055278.computeRecurrence(5), "3, 26, 116, 387, 1068, 2587, 5678, 11540, 22034, 39957, 69366, 116009, 187823, 295574, 453582", 0);
  }
}

