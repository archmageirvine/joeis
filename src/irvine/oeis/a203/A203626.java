package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203626.
 * @author Sean A. Irvine
 */
public class A203626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203626() {
    super(new long[] {1, -195, 195}, new long[] {1, 117, 22625});
  }
}
