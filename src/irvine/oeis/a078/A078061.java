package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078061.
 * @author Sean A. Irvine
 */
public class A078061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078061() {
    super(new long[] {-1, 0, -2}, new long[] {1, -3, 6});
  }
}
