package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259966.
 * @author Sean A. Irvine
 */
public class A259966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259966() {
    super(new long[] {-1, 2, -5, 6, -6, 4}, new long[] {0, 0, 2, 7, 16, 34});
  }
}
