package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181527.
 * @author Sean A. Irvine
 */
public class A181527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181527() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 4, 13, 38});
  }
}
