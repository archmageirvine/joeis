package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094649 An accelerator sequence for Catalan's constant.
 * @author Sean A. Irvine
 */
public class A094649 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094649() {
    super(new long[] {-1, -2, 3, 1}, new long[] {4, 1, 7, 4});
  }
}
