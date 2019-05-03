package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027444 <code>a(n) = n^3 + n^2 +</code> n.
 * @author Sean A. Irvine
 */
public class A027444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027444() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 3, 14, 39});
  }
}
