package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017221 a(n) = 9*n + 5.
 * @author Sean A. Irvine
 */
public class A017221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017221() {
    super(new long[] {-1, 2}, new long[] {5, 14});
  }
}
