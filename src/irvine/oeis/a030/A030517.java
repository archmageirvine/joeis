package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030517.
 * @author Sean A. Irvine
 */
public class A030517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030517() {
    super(new long[] {-25, -20, 10, 4}, new long[] {1, 2, 13, 52});
  }
}
