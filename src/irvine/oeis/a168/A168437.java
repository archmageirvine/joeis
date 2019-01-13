package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168437.
 * @author Sean A. Irvine
 */
public class A168437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168437() {
    super(new long[] {-1, 1, 1}, new long[] {3, 13, 13});
  }
}
