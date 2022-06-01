package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174814 a(n) = n*(n+1)*(5*n+1)/3.
 * @author Sean A. Irvine
 */
public class A174814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174814() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 22, 64});
  }
}
