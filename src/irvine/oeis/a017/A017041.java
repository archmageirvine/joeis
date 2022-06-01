package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017041 a(n) = 7*n + 5.
 * @author Sean A. Irvine
 */
public class A017041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017041() {
    super(new long[] {-1, 2}, new long[] {5, 12});
  }
}
