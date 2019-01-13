package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158002.
 * @author Sean A. Irvine
 */
public class A158002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158002() {
    super(new long[] {-1, 2}, new long[] {1, 393});
  }
}
