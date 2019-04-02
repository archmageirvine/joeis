package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109620 a(n) = (1/3)*n^3 - n^2 - (1/3)*n - 1.
 * @author Sean A. Irvine
 */
public class A109620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109620() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, -2, -3, -2});
  }
}
