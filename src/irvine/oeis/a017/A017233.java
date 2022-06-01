package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017233 a(n) = 9*n + 6.
 * @author Sean A. Irvine
 */
public class A017233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017233() {
    super(new long[] {-1, 2}, new long[] {6, 15});
  }
}
