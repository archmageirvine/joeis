package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071101.
 * @author Sean A. Irvine
 */
public class A071101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071101() {
    super(new long[] {-1, 2, 2, 2}, new long[] {5, 16, 45, 130});
  }
}
