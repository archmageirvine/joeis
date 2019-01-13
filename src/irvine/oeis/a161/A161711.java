package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161711.
 * @author Sean A. Irvine
 */
public class A161711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161711() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 13, 26});
  }
}
