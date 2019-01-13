package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158681.
 * @author Sean A. Irvine
 */
public class A158681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158681() {
    super(new long[] {-64, 96, -52, 12}, new long[] {4, 48, 368, 2304});
  }
}
