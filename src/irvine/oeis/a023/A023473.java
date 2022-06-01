package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023473 n-31.
 * @author Sean A. Irvine
 */
public class A023473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023473() {
    super(new long[] {-1, 2}, new long[] {-31, -30});
  }
}
