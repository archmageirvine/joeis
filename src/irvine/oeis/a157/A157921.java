package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157921.
 * @author Sean A. Irvine
 */
public class A157921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157921() {
    super(new long[] {-1, 2}, new long[] {71, 143});
  }
}
