package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183156.
 * @author Sean A. Irvine
 */
public class A183156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183156() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 2, 7, 22});
  }
}
