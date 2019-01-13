package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180415.
 * @author Sean A. Irvine
 */
public class A180415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180415() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 6, 11});
  }
}
