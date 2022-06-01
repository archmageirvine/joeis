package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133337 a(3n) = 0, a(3n+1) = a(3n+2) = 5^n.
 * @author Sean A. Irvine
 */
public class A133337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133337() {
    super(new long[] {5, 0, 0}, new long[] {0, 1, 1});
  }
}
