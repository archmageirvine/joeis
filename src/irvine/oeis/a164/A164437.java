package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164437.
 * @author Sean A. Irvine
 */
public class A164437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164437() {
    super(new long[] {1, 2, 3, 2, 0, 0}, new long[] {13, 22, 37, 62, 104, 174});
  }
}
