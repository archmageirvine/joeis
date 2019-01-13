package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257932.
 * @author Sean A. Irvine
 */
public class A257932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257932() {
    super(new long[] {-1, 0, -1, 0, 1, 1, 1}, new long[] {1, 1, 2, 4, 7, 12, 22});
  }
}
