package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151980.
 * @author Sean A. Irvine
 */
public class A151980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151980() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 5, 16, 20});
  }
}
