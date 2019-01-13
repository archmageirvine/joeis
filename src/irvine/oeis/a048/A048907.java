package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048907.
 * @author Sean A. Irvine
 */
public class A048907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048907() {
    super(new long[] {1, -17, 17}, new long[] {1, 10, 154});
  }
}
