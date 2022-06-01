package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104005 a(n+3) = a(n+2) + 3a(n+1) - 2a(n); a(0) = 1, a(1) = -1, a(2)= 3.
 * @author Sean A. Irvine
 */
public class A104005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104005() {
    super(new long[] {-2, 3, 1}, new long[] {1, -1, 3});
  }
}
