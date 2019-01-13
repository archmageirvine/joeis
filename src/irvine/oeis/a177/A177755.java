package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177755.
 * @author Sean A. Irvine
 */
public class A177755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177755() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 4, 18, 80, 200, 468, 882, 1600});
  }
}
