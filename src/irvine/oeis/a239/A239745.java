package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239745 a(n) = (3*2^(n+2) + n*(n+5))/2 - 6.
 * @author Sean A. Irvine
 */
public class A239745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239745() {
    super(new long[] {-2, 7, -9, 5}, new long[] {0, 9, 25, 54});
  }
}
