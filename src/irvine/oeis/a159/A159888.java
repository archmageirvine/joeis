package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159888 Numbers congruent to {-5,29,39,41,43,45,55,57,59,93,103,105,107,109,119,121} mod 256.
 * @author Sean A. Irvine
 */
public class A159888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159888() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {29, 39, 41, 43, 45, 55, 57, 59, 93, 103, 105, 107, 109, 119, 121, 251, 285});
  }
}
