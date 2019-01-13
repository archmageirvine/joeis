package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094360.
 * @author Sean A. Irvine
 */
public class A094360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094360() {
    super(new long[] {4, 4, -1}, new long[] {1, 2, 7});
  }
}
