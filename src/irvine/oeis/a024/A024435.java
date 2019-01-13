package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024435.
 * @author Sean A. Irvine
 */
public class A024435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024435() {
    super(new long[] {-720, 972, -280, 29}, new long[] {1, 29, 561, 9121});
  }
}
