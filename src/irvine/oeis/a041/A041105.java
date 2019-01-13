package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041105.
 * @author Sean A. Irvine
 */
public class A041105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041105() {
    super(new long[] {-1, 0, 0, 0, 62, 0, 0, 0}, new long[] {1, 1, 3, 4, 59, 63, 185, 248});
  }
}
