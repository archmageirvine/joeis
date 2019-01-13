package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062781.
 * @author Sean A. Irvine
 */
public class A062781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062781() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 0, 0, 1, 2});
  }
}
