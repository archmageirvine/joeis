package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047928 a(n) = n*(n-1)^2*(n-2).
 * @author Sean A. Irvine
 */
public class A047928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047928() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 12, 72, 240, 600});
  }
}
