package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199208 a(n) = 9*4^n+1.
 * @author Sean A. Irvine
 */
public class A199208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199208() {
    super(new long[] {-4, 5}, new long[] {10, 37});
  }
}
