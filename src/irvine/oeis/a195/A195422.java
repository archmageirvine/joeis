package irvine.oeis.a195;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A195422 Permanents of certain n X 2 cyclic (1,-1) matrices.
 * @author Georg Fischer
 */
public class A195422 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A195422() {
    super(1, "[[0],[16],[-16, 4],[-8],[0,-1],[1]]", "[-3, 2, 2,-8]", 0);
  }
}
