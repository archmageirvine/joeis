package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229135.
 * @author Sean A. Irvine
 */
public class A229135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229135() {
    super(new long[] {-16, 40, -33, 10}, new long[] {0, 4, 20, 102});
  }
}
