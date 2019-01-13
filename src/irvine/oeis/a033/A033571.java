package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033571.
 * @author Sean A. Irvine
 */
public class A033571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033571() {
    super(new long[] {1, -3, 3}, new long[] {1, 18, 55});
  }
}
