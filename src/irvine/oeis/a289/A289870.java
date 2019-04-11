package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289870 <code>a(n) = n*(n + 1)</code> for n odd, otherwise <code>a(n) = (n - 1)*(n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A289870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289870() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {-1, 2, 3, 12, 15});
  }
}
