package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006498.
 * @author Sean A. Irvine
 */
public class A006498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006498() {
    super(new long[] {1, 1, 0, 1}, new long[] {1, 1, 1, 2});
  }
}

