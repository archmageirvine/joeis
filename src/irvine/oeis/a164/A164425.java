package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164425.
 * @author Sean A. Irvine
 */
public class A164425 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164425() {
    super(new long[] {1, 1, 1, 0, 1}, new long[] {13, 22, 37, 62, 105});
  }
}
