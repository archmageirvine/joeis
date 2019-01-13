package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051673.
 * @author Sean A. Irvine
 */
public class A051673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051673() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 12, 47});
  }
}
