package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157952.
 * @author Sean A. Irvine
 */
public class A157952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157952() {
    super(new long[] {-1, 2}, new long[] {163, 325});
  }
}
