package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199300 a(n) = (2*n + 1)*7^n.
 * @author Sean A. Irvine
 */
public class A199300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199300() {
    super(new long[] {-49, 14}, new long[] {1, 21});
  }
}
