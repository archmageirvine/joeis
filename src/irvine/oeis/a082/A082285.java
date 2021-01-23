package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082285 a(n) = 16n + 13.
 * @author Sean A. Irvine
 */
public class A082285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082285() {
    super(new long[] {-1, 2}, new long[] {13, 29});
  }
}
