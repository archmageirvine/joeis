package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158543.
 * @author Sean A. Irvine
 */
public class A158543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158543() {
    super(new long[] {1, -3, 3}, new long[] {132, 564, 1284});
  }
}
