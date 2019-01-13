package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094014.
 * @author Sean A. Irvine
 */
public class A094014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094014() {
    super(new long[] {8, 0}, new long[] {1, -2});
  }
}
