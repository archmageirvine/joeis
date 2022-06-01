package irvine.oeis.a264;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A264444 a(n) = n*(n + 7)*(n + 14)/6.
 * @author Sean A. Irvine
 */
public class A264444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264444() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 20, 48, 85});
  }
}
