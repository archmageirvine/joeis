package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017354 <code>a(n) = (10*n + 7)^2</code>.
 * @author Sean A. Irvine
 */
public class A017354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017354() {
    super(new long[] {1, -3, 3}, new long[] {49, 289, 729});
  }
}
