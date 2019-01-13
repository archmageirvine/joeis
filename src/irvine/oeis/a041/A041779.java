package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041779.
 * @author Sean A. Irvine
 */
public class A041779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041779() {
    super(new long[] {-1, 0, 162, 0}, new long[] {1, 4, 161, 648});
  }
}
