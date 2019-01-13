package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183112.
 * @author Sean A. Irvine
 */
public class A183112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183112() {
    super(new long[] {6, -5, -2, -2, 4}, new long[] {0, 1, 4, 13, 38});
  }
}
