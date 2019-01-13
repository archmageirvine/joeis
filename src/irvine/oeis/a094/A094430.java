package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094430.
 * @author Sean A. Irvine
 */
public class A094430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094430() {
    super(new long[] {7, -14, 7}, new long[] {7, 49, 245});
  }
}
