package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182323.
 * @author Sean A. Irvine
 */
public class A182323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182323() {
    super(new long[] {-1, 1, 1}, new long[] {25, 72, 122});
  }
}
