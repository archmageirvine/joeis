package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162849.
 * @author Sean A. Irvine
 */
public class A162849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162849() {
    super(new long[] {9900, 0, -10100, 0, 201, 0}, new long[] {0, 1, 10, 101, 2010, 10201});
  }
}
