package irvine.oeis.a304;

import irvine.oeis.LinearRecurrence;

/**
 * A304993 <code>a(n) = n*(n + 1)*(7*n + 5)/6</code>.
 * @author Sean A. Irvine
 */
public class A304993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A304993() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 19, 52});
  }
}
