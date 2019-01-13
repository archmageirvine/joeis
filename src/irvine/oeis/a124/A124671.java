package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124671.
 * @author Sean A. Irvine
 */
public class A124671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124671() {
    super(new long[] {2, -9, 16, -14, 6}, new long[] {1, 3, 7, 16, 37});
  }
}
