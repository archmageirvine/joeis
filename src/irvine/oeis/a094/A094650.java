package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094650 An accelerator sequence for Catalan's constant.
 * @author Sean A. Irvine
 */
public class A094650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094650() {
    super(new long[] {-1, -3, 3, 4, -1}, new long[] {5, -1, 9, -4, 25});
  }
}
