package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094161.
 * @author Sean A. Irvine
 */
public class A094161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094161() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 5, 315, 2670, 10810});
  }
}
