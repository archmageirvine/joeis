package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262140.
 * @author Sean A. Irvine
 */
public class A262140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262140() {
    super(new long[] {1, -7, 7}, new long[] {20, 136, 812});
  }
}
