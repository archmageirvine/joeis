package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025440.
 * @author Sean A. Irvine
 */
public class A025440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025440() {
    super(new long[] {-144, 180, -80, 15}, new long[] {1, 15, 145, 1155});
  }
}
