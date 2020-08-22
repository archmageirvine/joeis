package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140680 a(n) = n*(3*n+16).
 * @author Sean A. Irvine
 */
public class A140680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140680() {
    super(new long[] {1, -3, 3}, new long[] {0, 19, 44});
  }
}
