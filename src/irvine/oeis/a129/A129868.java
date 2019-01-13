package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129868.
 * @author Sean A. Irvine
 */
public class A129868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129868() {
    super(new long[] {8, -14, 7}, new long[] {0, 5, 27});
  }
}
