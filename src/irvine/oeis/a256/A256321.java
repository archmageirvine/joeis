package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256321.
 * @author Sean A. Irvine
 */
public class A256321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256321() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {0, 2, 8, 19, 33, 52});
  }
}
