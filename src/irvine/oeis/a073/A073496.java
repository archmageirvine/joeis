package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073496.
 * @author Sean A. Irvine
 */
public class A073496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073496() {
    super(new long[] {1, -3, -1}, new long[] {3, -1, -5});
  }
}
