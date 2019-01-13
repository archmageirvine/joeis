package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240711.
 * @author Sean A. Irvine
 */
public class A240711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240711() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 15, 62, 163, 333, 596, 973, 1475});
  }
}
