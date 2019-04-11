package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243138 <code>n^2 + 15*n + 13</code>.
 * @author Sean A. Irvine
 */
public class A243138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243138() {
    super(new long[] {1, -3, 3}, new long[] {13, 29, 47});
  }
}
