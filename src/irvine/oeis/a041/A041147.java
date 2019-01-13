package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041147.
 * @author Sean A. Irvine
 */
public class A041147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041147() {
    super(new long[] {-1, 0, 164, 0}, new long[] {1, 9, 163, 1476});
  }
}
