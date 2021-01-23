package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131949 Row sums of triangle A131948.
 * @author Sean A. Irvine
 */
public class A131949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131949() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 6, 16, 32});
  }
}
