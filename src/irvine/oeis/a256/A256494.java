package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256494.
 * @author Sean A. Irvine
 */
public class A256494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256494() {
    super(new long[] {-2, 1, 0, 0, 2}, new long[] {0, 1, 1, 2, 3});
  }
}
