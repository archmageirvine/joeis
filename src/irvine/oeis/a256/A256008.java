package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256008.
 * @author Sean A. Irvine
 */
public class A256008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256008() {
    super(new long[] {-1, 2, -2, 2}, new long[] {3, 4, 1, 2});
  }
}
