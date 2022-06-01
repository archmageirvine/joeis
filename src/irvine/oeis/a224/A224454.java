package irvine.oeis.a224;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A224454 The Wiener index of the linear phenylene with n hexagons.
 * @author Sean A. Irvine
 */
public class A224454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224454() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 180, 567, 1296});
  }
}
