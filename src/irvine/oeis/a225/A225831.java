package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225831.
 * @author Sean A. Irvine
 */
public class A225831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225831() {
    super(new long[] {262144, -18432, -1920, 144}, new long[] {1, 72, 4224, 529920});
  }
}
