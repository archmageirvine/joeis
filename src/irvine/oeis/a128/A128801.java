package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128801 a(n) = n*(n-1)*7^n.
 * @author Sean A. Irvine
 */
public class A128801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128801() {
    super(1, new long[] {343, -147, 21}, new long[] {0, 98, 2058});
  }
}
