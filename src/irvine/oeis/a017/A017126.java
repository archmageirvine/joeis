package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017126 a(n) = (8*n + 5)^2.
 * @author Sean A. Irvine
 */
public class A017126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017126() {
    super(new long[] {1, -3, 3}, new long[] {25, 169, 441});
  }
}
