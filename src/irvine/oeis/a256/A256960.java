package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256960.
 * @author Sean A. Irvine
 */
public class A256960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256960() {
    super(new long[] {-4, -8, 1, 4}, new long[] {1, 4, 11, 36});
  }
}
