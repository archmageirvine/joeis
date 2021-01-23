package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140674 a(n) = n*(3*n + 17)/2.
 * @author Sean A. Irvine
 */
public class A140674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140674() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 23});
  }
}
