package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140403.
 * @author Sean A. Irvine
 */
public class A140403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140403() {
    super(new long[] {1, 0, -1, -1, 0, 0, 0, 1, 1, 0}, new long[] {0, 0, 0, 0, 8, 24, 32, 56, 72, 96});
  }
}
