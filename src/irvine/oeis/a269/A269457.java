package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269457 <code>a(n) = 5*(n + 1)*(n + 4)/2</code>.
 * @author Sean A. Irvine
 */
public class A269457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269457() {
    super(new long[] {1, -3, 3}, new long[] {10, 25, 45});
  }
}
