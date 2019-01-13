package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267711.
 * @author Sean A. Irvine
 */
public class A267711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267711() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 2, 15});
  }
}
