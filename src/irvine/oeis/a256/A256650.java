package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256650.
 * @author Sean A. Irvine
 */
public class A256650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256650() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 31, 118});
  }
}
