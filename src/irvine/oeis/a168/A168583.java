package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168583.
 * @author Sean A. Irvine
 */
public class A168583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168583() {
    super(new long[] {6, -11, 6}, new long[] {1, 4, 16});
  }
}
