package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152750 Eight times hexagonal numbers: 8*n*(2*n-1).
 * @author Sean A. Irvine
 */
public class A152750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152750() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 48});
  }
}
