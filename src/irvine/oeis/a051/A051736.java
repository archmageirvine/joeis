package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051736.
 * @author Sean A. Irvine
 */
public class A051736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051736() {
    super(new long[] {-1, 0, 6, 2}, new long[] {1, 5, 17, 63});
  }
}
