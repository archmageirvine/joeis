package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017284 a(n) = (10*n + 1)^4.
 * @author Sean A. Irvine
 */
public class A017284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017284() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 14641, 194481, 923521, 2825761});
  }
}
