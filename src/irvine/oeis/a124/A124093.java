package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124093 Triangular numbers alternating with squares.
 * @author Sean A. Irvine
 */
public class A124093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124093() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 0, 1, 1, 3, 4});
  }
}
