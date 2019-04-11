package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157990 <code>a(n) = 288*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A157990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157990() {
    super(new long[] {-1, 2}, new long[] {289, 577});
  }
}
