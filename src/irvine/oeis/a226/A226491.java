package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226491 a(n) = n*(21*n-17)/2.
 * @author Sean A. Irvine
 */
public class A226491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226491() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 25});
  }
}
