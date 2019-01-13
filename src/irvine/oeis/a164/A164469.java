package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164469.
 * @author Sean A. Irvine
 */
public class A164469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164469() {
    super(new long[] {-1, 1, -1, 1, -1, 2}, new long[] {13, 20, 32, 51, 81, 128});
  }
}
