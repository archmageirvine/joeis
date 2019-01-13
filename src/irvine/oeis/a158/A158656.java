package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158656.
 * @author Sean A. Irvine
 */
public class A158656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158656() {
    super(new long[] {1, -3, 3}, new long[] {53, 215, 485});
  }
}
