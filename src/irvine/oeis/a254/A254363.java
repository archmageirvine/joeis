package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254363.
 * @author Sean A. Irvine
 */
public class A254363 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254363() {
    super(new long[] {-24, 50, -35, 10}, new long[] {20, 35, 77, 203});
  }
}
