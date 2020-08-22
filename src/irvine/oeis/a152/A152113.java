package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152113 A001333 with terms repeated.
 * @author Sean A. Irvine
 */
public class A152113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152113() {
    super(new long[] {1, 0, 2, 0}, new long[] {1, 1, 3, 3});
  }
}
