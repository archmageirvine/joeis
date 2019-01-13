package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256496.
 * @author Sean A. Irvine
 */
public class A256496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256496() {
    super(new long[] {1, 2, 2, 1, 0, -1, -2, -2}, new long[] {31, 32, 33, 34, 35, 6, 37, 38});
  }
}
