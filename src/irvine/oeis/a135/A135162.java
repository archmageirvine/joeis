package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135162.
 * @author Sean A. Irvine
 */
public class A135162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135162() {
    super(new long[] {-210, 247, -101, 17}, new long[] {0, 1, 19, 199});
  }
}
