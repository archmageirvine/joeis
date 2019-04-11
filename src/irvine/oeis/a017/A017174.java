package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017174 <code>a(n) = (9*n + 1)^2</code>.
 * @author Sean A. Irvine
 */
public class A017174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017174() {
    super(new long[] {1, -3, 3}, new long[] {1, 100, 361});
  }
}
