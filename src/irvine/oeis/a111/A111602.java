package irvine.oeis.a111;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A111602 Third column (m=2) of unsigned triangle A111595.
 * @author Georg Fischer
 */
public class A111602 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A111602() {
    super(2, "[[0],[-1, 1],[2],[2,-1]]", "1", 0);
    setGfType(1);
  }
}
