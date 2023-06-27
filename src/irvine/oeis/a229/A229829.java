package irvine.oeis.a229;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A229829 Numbers coprime to 15.
 * @author Sean A. Irvine
 */
public class A229829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229829() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 7, 8, 11, 13, 14, 16});
  }
}
