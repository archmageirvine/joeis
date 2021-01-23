package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157951 a(n) = 128*n + 1.
 * @author Sean A. Irvine
 */
public class A157951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157951() {
    super(new long[] {-1, 2}, new long[] {129, 257});
  }
}
