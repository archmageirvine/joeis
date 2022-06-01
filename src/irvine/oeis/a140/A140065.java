package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140065 a(n) = (7*n^2 - 17*n + 12)/2.
 * @author Sean A. Irvine
 */
public class A140065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140065() {
    super(new long[] {1, -3, 3}, new long[] {1, 3, 12});
  }
}
