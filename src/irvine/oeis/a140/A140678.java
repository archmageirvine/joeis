package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140678 a(n) = n*(3*n + 10).
 * @author Sean A. Irvine
 */
public class A140678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140678() {
    super(new long[] {1, -3, 3}, new long[] {0, 13, 32});
  }
}
