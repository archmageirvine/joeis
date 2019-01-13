package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026065.
 * @author Sean A. Irvine
 */
public class A026065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026065() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {14, 23, 36, 51, 69, 90, 114, 143});
  }
}
