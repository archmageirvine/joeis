package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017498 a(n) = (11*n + 9)^2.
 * @author Sean A. Irvine
 */
public class A017498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017498() {
    super(new long[] {1, -3, 3}, new long[] {81, 400, 961});
  }
}
