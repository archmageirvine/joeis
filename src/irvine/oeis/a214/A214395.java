package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214395 Decimal expansion of 16/27.
 * @author Sean A. Irvine
 */
public class A214395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214395() {
    super(new long[] {1, 0, 0}, new long[] {5, 9, 2});
  }
}
