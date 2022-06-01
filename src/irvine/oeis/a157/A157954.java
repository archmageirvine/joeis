package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157954 162n - 1.
 * @author Sean A. Irvine
 */
public class A157954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157954() {
    super(new long[] {-1, 2}, new long[] {161, 323});
  }
}
