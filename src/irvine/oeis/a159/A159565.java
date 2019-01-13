package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159565.
 * @author Sean A. Irvine
 */
public class A159565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159565() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {221, 241, 265, 1061, 1205, 1369});
  }
}
