package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168392.
 * @author Sean A. Irvine
 */
public class A168392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168392() {
    super(new long[] {-1, 1, 1}, new long[] {5, 5, 13});
  }
}
