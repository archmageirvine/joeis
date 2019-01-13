package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131380.
 * @author Sean A. Irvine
 */
public class A131380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131380() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 1, 2});
  }
}
