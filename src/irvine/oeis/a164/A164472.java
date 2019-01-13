package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164472.
 * @author Sean A. Irvine
 */
public class A164472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164472() {
    super(new long[] {-1, 0, 0, 2, 0, 1}, new long[] {13, 22, 37, 61, 101, 167});
  }
}
