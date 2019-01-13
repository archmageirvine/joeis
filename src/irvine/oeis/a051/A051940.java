package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051940.
 * @author Sean A. Irvine
 */
public class A051940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051940() {
    super(new long[] {1, -3, 3}, new long[] {6, 15, 25});
  }
}
