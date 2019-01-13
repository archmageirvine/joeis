package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129682.
 * @author Sean A. Irvine
 */
public class A129682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129682() {
    super(new long[] {-1, 1, -2, 1, 0, 2}, new long[] {1, 1, 2, 4, 7, 15});
  }
}
