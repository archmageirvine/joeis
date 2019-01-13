package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097833.
 * @author Sean A. Irvine
 */
public class A097833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097833() {
    super(new long[] {1, -21, 21}, new long[] {1, 21, 420});
  }
}
