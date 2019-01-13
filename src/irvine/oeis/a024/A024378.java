package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024378.
 * @author Sean A. Irvine
 */
public class A024378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024378() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {5, 59, 254, 730, 1675});
  }
}
