package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042393.
 * @author Sean A. Irvine
 */
public class A042393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042393() {
    super(new long[] {-1, 0, 0, 0, 484, 0, 0, 0}, new long[] {1, 1, 8, 9, 476, 485, 3871, 4356});
  }
}
