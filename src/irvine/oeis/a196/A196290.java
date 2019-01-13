package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196290.
 * @author Sean A. Irvine
 */
public class A196290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196290() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 2, 514, 19686, 262148, 1953130, 10077702, 40353614, 134217736, 387420498});
  }
}
