package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082285 a(n) = 16*n + 13.
 * @author Sean A. Irvine
 */
public class A082285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082285() {
    super(new long[] {-1, 2}, new long[] {13, 29});
  }
}
