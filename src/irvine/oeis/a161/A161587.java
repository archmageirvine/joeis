package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161587 a(n) = 13*n^2 + 10*n + 1.
 * @author Sean A. Irvine
 */
public class A161587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161587() {
    super(new long[] {1, -3, 3}, new long[] {1, 24, 73});
  }
}
