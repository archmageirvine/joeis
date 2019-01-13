package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157734.
 * @author Sean A. Irvine
 */
public class A157734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157734() {
    super(new long[] {1, -3, 3}, new long[] {135, 1064, 2875});
  }
}
