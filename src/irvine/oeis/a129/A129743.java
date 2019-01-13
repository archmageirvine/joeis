package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129743.
 * @author Sean A. Irvine
 */
public class A129743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129743() {
    super(new long[] {1, -5, 5}, new long[] {2, 12, 50});
  }
}
