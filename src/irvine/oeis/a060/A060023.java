package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060023.
 * @author Sean A. Irvine
 */
public class A060023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060023() {
    super(new long[] {-1, 1, 1, 0, 0, -2, 0, 0, 1, 1}, new long[] {1, 0, 1, 1, 1, 0, 1, -1, -1, -3});
  }
}
