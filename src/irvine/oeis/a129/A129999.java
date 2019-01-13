package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129999.
 * @author Sean A. Irvine
 */
public class A129999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129999() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 27, 888, 1011, 1148, 6027, 6740});
  }
}
