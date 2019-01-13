package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242668.
 * @author Sean A. Irvine
 */
public class A242668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242668() {
    super(new long[] {4, -1, 0, -16, 8}, new long[] {1, 8, 48, 256, 1279});
  }
}
