package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122503 a(n) = 22*a(n - 2) + 54*a(n - 3) + 38*a(n - 4).
 * @author Sean A. Irvine
 */
public class A122503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122503() {
    super(new long[] {38, 54, 22, 0}, new long[] {1, 1, 1, 1});
  }
}
