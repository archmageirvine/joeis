package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026066.
 * @author Sean A. Irvine
 */
public class A026066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026066() {
    super(new long[] {-1, 4, -6, 4}, new long[] {105, 168, 246, 340});
  }
}
