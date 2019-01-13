package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164464.
 * @author Sean A. Irvine
 */
public class A164464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164464() {
    super(new long[] {-1, 1, -1, 2}, new long[] {13, 20, 31, 47});
  }
}
