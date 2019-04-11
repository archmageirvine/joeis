package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220084 <code>a(n) = (n + 1)*(20*n^2 + 19*n + 6)/6</code>.
 * @author Sean A. Irvine
 */
public class A220084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220084() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 15, 62, 162});
  }
}
