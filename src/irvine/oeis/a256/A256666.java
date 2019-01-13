package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256666.
 * @author Sean A. Irvine
 */
public class A256666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256666() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 5, 14, 29, 51});
  }
}
