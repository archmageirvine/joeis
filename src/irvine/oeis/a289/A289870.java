package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289870 a(n) = n*(n + 1) for n odd, otherwise a(n) = (n - 1)*(n + 1).
 * @author Sean A. Irvine
 */
public class A289870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289870() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {-1, 2, 3, 12, 15});
  }
}
