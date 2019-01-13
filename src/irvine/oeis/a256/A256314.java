package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256314.
 * @author Sean A. Irvine
 */
public class A256314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256314() {
    super(new long[] {1, -2, 0, 2, -2, 1, 2, -2, -1, 2, -2, 0, 2}, new long[] {0, 0, 1, 5, 13, 30, 57, 101, 164, 255, 377, 540, 748});
  }
}
