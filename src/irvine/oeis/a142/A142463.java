package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142463.
 * @author Sean A. Irvine
 */
public class A142463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142463() {
    super(new long[] {1, -3, 3}, new long[] {-1, 3, 11});
  }
}
