package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017450 a(n) = (11*n + 5)^2.
 * @author Sean A. Irvine
 */
public class A017450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017450() {
    super(new long[] {1, -3, 3}, new long[] {25, 256, 729});
  }
}
