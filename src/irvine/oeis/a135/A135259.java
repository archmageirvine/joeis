package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135259 a(n) = 3*A131666(n) - A131666(n+1).
 * @author Sean A. Irvine
 */
public class A135259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135259() {
    super(new long[] {2, -1, 0, 2}, new long[] {0, -1, 2, 1});
  }
}
