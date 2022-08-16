package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055366 Number of asymmetric mobiles (circular rooted trees) with n nodes and 5 leaves.
 * @author Georg Fischer
 */
public class A055366 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055366() {
    super(7, A055278.computeRecurrence(5), "1, 7, 31, 109, 321, 833, 1951, 4212, 8498, 16205, 29449, 51349, 86363, 140731, 222986, 344607, 520758", 0);
  }
}

