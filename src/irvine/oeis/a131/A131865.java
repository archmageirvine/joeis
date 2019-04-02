package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131865 Partial sums of powers of 16.
 * @author Sean A. Irvine
 */
public class A131865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131865() {
    super(new long[] {-16, 17}, new long[] {1, 17});
  }
}
