package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078712.
 * @author Sean A. Irvine
 */
public class A078712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078712() {
    super(new long[] {1, 0, -1}, new long[] {-3, 1, -1});
  }
}
