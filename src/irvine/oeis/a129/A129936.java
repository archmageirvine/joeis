package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129936.
 * @author Sean A. Irvine
 */
public class A129936 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129936() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-2, -2, 0, 5});
  }
}
