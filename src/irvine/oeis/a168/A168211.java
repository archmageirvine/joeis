package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168211.
 * @author Sean A. Irvine
 */
public class A168211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168211() {
    super(new long[] {-1, 1, 1}, new long[] {0, 15, 7});
  }
}
