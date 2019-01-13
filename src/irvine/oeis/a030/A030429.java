package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030429.
 * @author Sean A. Irvine
 */
public class A030429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030429() {
    super(new long[] {-7, 21, -22, 9}, new long[] {1, 2, 7, 26});
  }
}
