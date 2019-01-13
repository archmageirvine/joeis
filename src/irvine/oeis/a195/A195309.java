package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195309.
 * @author Sean A. Irvine
 */
public class A195309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195309() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {1, 9, 11, 45, 39, 126, 94, 270});
  }
}
