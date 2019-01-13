package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042081.
 * @author Sean A. Irvine
 */
public class A042081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042081() {
    super(new long[] {-1, 0, 0, 0, 190, 0, 0, 0}, new long[] {1, 1, 3, 4, 187, 191, 569, 760});
  }
}
