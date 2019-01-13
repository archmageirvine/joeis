package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235593.
 * @author Sean A. Irvine
 */
public class A235593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235593() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 1, 7, 31, 106});
  }
}
