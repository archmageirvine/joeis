package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078041.
 * @author Sean A. Irvine
 */
public class A078041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078041() {
    super(new long[] {2, 1, -1}, new long[] {1, -2, 3});
  }
}
