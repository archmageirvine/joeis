package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256008 Self-inverse permutation of positive integers: 4k+1 is swapped with 4k+3, and 4k+2 with 4k+4.
 * @author Sean A. Irvine
 */
public class A256008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256008() {
    super(1, new long[] {-1, 2, -2, 2}, new long[] {3, 4, 1, 2});
  }
}
