package irvine.oeis.a055;

import irvine.oeis.HolonomicRecurrence;

/**
 * A055292 Number of trees with n nodes and 5 leaves.
 * @author Georg Fischer
 */
public class A055292 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055292() {
    super(6, A055278.computeRecurrence(5), "1, 2, 6, 14, 32, 64, 123, 219, 377, 616, 978, 1496, 2236, 3251, 4637", 0);
  }
}

