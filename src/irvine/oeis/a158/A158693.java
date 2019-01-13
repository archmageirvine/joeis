package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158693.
 * @author Sean A. Irvine
 */
public class A158693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158693() {
    super(new long[] {1, -3, 3}, new long[] {65, 263, 593});
  }
}
