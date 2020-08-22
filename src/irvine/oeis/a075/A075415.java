package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075415 Squares of A002280 or numbers (666...6)^2.
 * @author Sean A. Irvine
 */
public class A075415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075415() {
    super(new long[] {1000, -1110, 111}, new long[] {0, 36, 4356});
  }
}
