package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051865.
 * @author Sean A. Irvine
 */
public class A051865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051865() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 13});
  }
}
