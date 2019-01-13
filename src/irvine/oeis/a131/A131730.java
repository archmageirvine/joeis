package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131730.
 * @author Sean A. Irvine
 */
public class A131730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131730() {
    super(new long[] {1, 1, 0, 0, -1}, new long[] {0, -1, 1, 0, 1});
  }
}
