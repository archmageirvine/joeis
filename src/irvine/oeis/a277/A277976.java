package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277976 <code>a(n) = n*(3*n + 23)</code>.
 * @author Sean A. Irvine
 */
public class A277976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277976() {
    super(new long[] {1, -3, 3}, new long[] {0, 26, 58});
  }
}
