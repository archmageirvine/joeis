package irvine.oeis.a344;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A344136 Number of linear intervals in the Tamari lattices.
 * @author Georg Fischer
 */
public class A344136 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A344136() {
    super(1, "[[0],[4,-10, 6,-4],[8,-2,-1, 1]]", "1", 0);
  }
}
