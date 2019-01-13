package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129371.
 * @author Sean A. Irvine
 */
public class A129371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129371() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 1, 5, 13, 29, 50, 86});
  }
}
