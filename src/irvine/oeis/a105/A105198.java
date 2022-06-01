package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105198 a(n) = n(n+1)/2 mod 4.
 * @author Sean A. Irvine
 */
public class A105198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105198() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1}, new long[] {0, 1, 3, 2, 2, 3, 1});
  }
}
