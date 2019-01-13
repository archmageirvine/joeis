package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051799.
 * @author Sean A. Irvine
 */
public class A051799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051799() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 14, 60, 170, 385});
  }
}
