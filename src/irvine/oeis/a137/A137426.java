package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137426 a(n)=-a(n-1)+2a(n-3).
 * @author Sean A. Irvine
 */
public class A137426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137426() {
    super(new long[] {2, 0, -1}, new long[] {0, 1, -3});
  }
}
