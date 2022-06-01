package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271740 a(n) = 3*n^2 - 2*n + 2.
 * @author Sean A. Irvine
 */
public class A271740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271740() {
    super(new long[] {1, -3, 3}, new long[] {2, 3, 10});
  }
}
