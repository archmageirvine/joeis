package irvine.oeis.a045;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A045945 Hexagonal matchstick numbers: a(n) = 3*n*(3*n+1).
 * @author Sean A. Irvine
 */
public class A045945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045945() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 42});
  }
}
