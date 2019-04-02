package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017282 a(n) = (10*n + 1)^2.
 * @author Sean A. Irvine
 */
public class A017282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017282() {
    super(new long[] {1, -3, 3}, new long[] {1, 121, 441});
  }
}
