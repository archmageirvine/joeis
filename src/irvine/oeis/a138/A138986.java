package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138986.
 * @author Sean A. Irvine
 */
public class A138986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138986() {
    super(new long[] {1, -1, 0, 0, 0, -2, 2, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 5, 13, 15, 17, 19, 21, 35});
  }
}
