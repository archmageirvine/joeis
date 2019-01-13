package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158740.
 * @author Sean A. Irvine
 */
public class A158740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158740() {
    super(new long[] {1, -3, 3}, new long[] {1, 73, 289});
  }
}
