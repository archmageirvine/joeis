package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111144 a(n) = n*(n+13)*(n+14)/6.
 * @author Sean A. Irvine
 */
public class A111144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111144() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 35, 80, 136});
  }
}
