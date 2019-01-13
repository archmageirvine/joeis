package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094806.
 * @author Sean A. Irvine
 */
public class A094806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094806() {
    super(new long[] {4, -10, 6}, new long[] {1, 5, 20});
  }
}
