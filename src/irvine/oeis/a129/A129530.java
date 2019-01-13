package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129530.
 * @author Sean A. Irvine
 */
public class A129530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129530() {
    super(new long[] {27, -27, 9}, new long[] {0, 0, 3});
  }
}
