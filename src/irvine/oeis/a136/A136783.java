package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136783.
 * @author Sean A. Irvine
 */
public class A136783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136783() {
    super(new long[] {20, -27, 10}, new long[] {1, 4, 20});
  }
}
