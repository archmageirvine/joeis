package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094789.
 * @author Sean A. Irvine
 */
public class A094789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094789() {
    super(new long[] {1, -6, 5}, new long[] {1, 4, 14});
  }
}
