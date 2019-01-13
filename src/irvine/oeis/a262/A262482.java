package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262482.
 * @author Sean A. Irvine
 */
public class A262482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262482() {
    super(new long[] {-2, 3, -1, 0, 0, 0, -2, 3}, new long[] {2, 3, 5, 10, 20, 40, 79, 158});
  }
}
