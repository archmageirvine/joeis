package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168332.
 * @author Sean A. Irvine
 */
public class A168332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168332() {
    super(new long[] {-1, 1, 1}, new long[] {6, 6, 13});
  }
}
