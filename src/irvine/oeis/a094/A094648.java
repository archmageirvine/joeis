package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094648 An accelerator sequence for Catalan's constant.
 * @author Sean A. Irvine
 */
public class A094648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094648() {
    super(new long[] {1, 2, -1}, new long[] {3, -1, 5});
  }
}
