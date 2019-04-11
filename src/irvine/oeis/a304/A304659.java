package irvine.oeis.a304;

import irvine.oeis.LinearRecurrence;

/**
 * A304659 <code>a(n) = n*(n + 1)*(16*n - 1)/6</code>.
 * @author Sean A. Irvine
 */
public class A304659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A304659() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 31, 94});
  }
}
