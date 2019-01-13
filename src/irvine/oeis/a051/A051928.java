package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051928.
 * @author Sean A. Irvine
 */
public class A051928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051928() {
    super(new long[] {1, 4, 2}, new long[] {4, 1, 13});
  }
}
