package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134593.
 * @author Sean A. Irvine
 */
public class A134593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134593() {
    super(new long[] {1, -3, 3}, new long[] {1, 16, 41});
  }
}
