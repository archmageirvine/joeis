package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129029.
 * @author Sean A. Irvine
 */
public class A129029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129029() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 30, 288, 1134, 3120});
  }
}
