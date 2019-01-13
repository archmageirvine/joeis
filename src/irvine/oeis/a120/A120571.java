package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120571.
 * @author Sean A. Irvine
 */
public class A120571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120571() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {12, 60, 220, 612, 1404});
  }
}
