package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199494 a(n) = 3*8^n + 1.
 * @author Sean A. Irvine
 */
public class A199494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199494() {
    super(new long[] {-8, 9}, new long[] {4, 25});
  }
}
