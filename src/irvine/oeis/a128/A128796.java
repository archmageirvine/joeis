package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128796 a(n) = n*(n-1)*2^n.
 * @author Sean A. Irvine
 */
public class A128796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128796() {
    super(new long[] {8, -12, 6}, new long[] {0, 0, 8});
  }
}
