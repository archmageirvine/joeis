package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109011 a(n) = gcd(n,8).
 * @author Sean A. Irvine
 */
public class A109011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109011() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {8, 1, 2, 1, 4, 1, 2, 1});
  }
}
