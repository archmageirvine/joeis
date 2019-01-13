package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021048.
 * @author Sean A. Irvine
 */
public class A021048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021048() {
    super(new long[] {-54, 105, -65, 15}, new long[] {1, 15, 160, 1530});
  }
}
