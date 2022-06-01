package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055352 Number of labeled mobiles (circular rooted trees) with n nodes and 5 leaves.
 * @author Georg Fischer
 */
public class A055352 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055352() {
    super(6, A055350.computeRecurrence(5), "144, 11508, 545664, 20469456, 678857760, 21047130720, 629779328640, 18547337128320, 544474197146880, 16067754570067200");
    setGfType(1);
  }
}

