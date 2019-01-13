package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129441.
 * @author Sean A. Irvine
 */
public class A129441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129441() {
    super(new long[] {-1, 0, 1, 4, 2, 1}, new long[] {1, 1, 2, 7, 16, 39});
  }
}
