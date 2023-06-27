package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168566 a(n) = (n-1)*(n+2)*(n^2 + n + 2)/4.
 * @author Sean A. Irvine
 */
public class A168566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168566() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {0, 8, 35, 99, 224});
  }
}
