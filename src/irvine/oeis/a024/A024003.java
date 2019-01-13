package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024003.
 * @author Sean A. Irvine
 */
public class A024003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024003() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 0, -31, -242, -1023, -3124});
  }
}
