package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227144.
 * @author Sean A. Irvine
 */
public class A227144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227144() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 7, 17, 23, 25});
  }
}
