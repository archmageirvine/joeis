package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157879.
 * @author Sean A. Irvine
 */
public class A157879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157879() {
    super(new long[] {1, -899, 899}, new long[] {0, 120, 107880});
  }
}
