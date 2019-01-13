package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017498.
 * @author Sean A. Irvine
 */
public class A017498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017498() {
    super(new long[] {1, -3, 3}, new long[] {81, 400, 961});
  }
}
