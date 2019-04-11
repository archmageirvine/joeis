package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134153 <code>a(n) = 15n^2 + 9n + 1</code>.
 * @author Sean A. Irvine
 */
public class A134153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134153() {
    super(new long[] {1, -3, 3}, new long[] {1, 25, 79});
  }
}
