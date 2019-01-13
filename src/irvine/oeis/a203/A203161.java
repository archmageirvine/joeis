package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203161.
 * @author Sean A. Irvine
 */
public class A203161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203161() {
    super(new long[] {-36, 0, 0, 12, 0, 0}, new long[] {1, 4, 11, 39, 57, 132});
  }
}
