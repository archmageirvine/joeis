package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158730.
 * @author Sean A. Irvine
 */
public class A158730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158730() {
    super(new long[] {1, -3, 3}, new long[] {67, 271, 611});
  }
}
