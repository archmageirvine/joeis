package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262592.
 * @author Sean A. Irvine
 */
public class A262592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262592() {
    super(new long[] {-3, 10, -12, 6}, new long[] {1, 2, 4, 10});
  }
}
