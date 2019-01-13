package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030441.
 * @author Sean A. Irvine
 */
public class A030441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030441() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-4, -1, 2, 13});
  }
}
