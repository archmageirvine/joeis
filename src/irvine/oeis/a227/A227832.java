package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227832.
 * @author Sean A. Irvine
 */
public class A227832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227832() {
    super(new long[] {1, 1, -1}, new long[] {1, 4, -1});
  }
}
