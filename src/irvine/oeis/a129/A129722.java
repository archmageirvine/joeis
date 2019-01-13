package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129722.
 * @author Sean A. Irvine
 */
public class A129722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129722() {
    super(new long[] {1, 1, -4, -3, 4, 1}, new long[] {0, 0, 1, 1, 5, 6});
  }
}
