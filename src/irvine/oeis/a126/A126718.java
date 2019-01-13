package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126718.
 * @author Sean A. Irvine
 */
public class A126718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126718() {
    super(new long[] {-24, 50, -35, 10}, new long[] {7, 43, 235, 1171});
  }
}
