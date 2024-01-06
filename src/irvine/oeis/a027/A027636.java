package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027636 Expansion of (1+x^19)/((1-x^2)*(1-x^4)^2*(1-x^6)).
 * @author Sean A. Irvine
 */
public class A027636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027636() {
    super(new long[] {-1, 1, 0, 0, 2, -2, 1, -1, -1, 1, -2, 2, 0, 0, 1},
      new long[] {3, 0, 4, 0, 7, 0, 9, 0, 14, 0, 17, 0, 24, 0, 29},
      1, 0, 1, 0);
  }
}
