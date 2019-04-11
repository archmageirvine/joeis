package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134154 <code>a(n) = 15n^2 - 9n + 1</code>.
 * @author Sean A. Irvine
 */
public class A134154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134154() {
    super(new long[] {1, -3, 3}, new long[] {1, 7, 43});
  }
}
