package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051941.
 * @author Sean A. Irvine
 */
public class A051941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051941() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 21, 46, 82});
  }
}
