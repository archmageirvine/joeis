package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129993.
 * @author Sean A. Irvine
 */
public class A129993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129993() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 21, 504, 597, 704, 3441, 3980});
  }
}
