package irvine.oeis.a202;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A202803 a(n) = n*(5*n+1).
 * @author Sean A. Irvine
 */
public class A202803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202803() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 22});
  }
}
