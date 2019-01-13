package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158673.
 * @author Sean A. Irvine
 */
public class A158673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158673() {
    super(new long[] {1, -3, 3}, new long[] {1, 61, 241});
  }
}
