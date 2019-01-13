package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159328.
 * @author Sean A. Irvine
 */
public class A159328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159328() {
    super(new long[] {1, -2, 3}, new long[] {2, 4, 10});
  }
}
