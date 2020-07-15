package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108211 <code>a(n) = 16*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A108211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108211() {
    super(new long[] {1, -3, 3}, new long[] {17, 65, 145});
  }
}
