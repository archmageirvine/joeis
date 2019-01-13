package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072674.
 * @author Sean A. Irvine
 */
public class A072674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072674() {
    super(new long[] {6, -11, 6}, new long[] {0, 4, 14});
  }
}
