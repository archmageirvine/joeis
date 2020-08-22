package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060566 a(n) = n^2 - 79*n + 1601.
 * @author Sean A. Irvine
 */
public class A060566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060566() {
    super(new long[] {1, -3, 3}, new long[] {1601, 1523, 1447});
  }
}
