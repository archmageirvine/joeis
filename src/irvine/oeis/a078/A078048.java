package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078048.
 * @author Sean A. Irvine
 */
public class A078048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078048() {
    super(new long[] {2, -2, -1}, new long[] {1, -2, 0});
  }
}
