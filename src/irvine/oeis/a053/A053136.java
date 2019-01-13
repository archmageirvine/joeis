package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053136.
 * @author Sean A. Irvine
 */
public class A053136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053136() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 36, 330, 1716, 6435, 19448, 50388, 116280});
  }
}
