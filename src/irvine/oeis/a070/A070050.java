package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070050.
 * @author Sean A. Irvine
 */
public class A070050 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070050() {
    super(new long[] {-8, 20, -18, 7}, new long[] {4, 12, 33, 87});
  }
}
