package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072328.
 * @author Sean A. Irvine
 */
public class A072328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072328() {
    super(new long[] {2, 1, 0}, new long[] {3, 0, 2});
  }
}
