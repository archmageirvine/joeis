package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157990.
 * @author Sean A. Irvine
 */
public class A157990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157990() {
    super(new long[] {-1, 2}, new long[] {289, 577});
  }
}
