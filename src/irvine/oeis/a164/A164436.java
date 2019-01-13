package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164436.
 * @author Sean A. Irvine
 */
public class A164436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164436() {
    super(new long[] {-1, -1, 0, 2, 0, 1}, new long[] {13, 21, 33, 52, 81, 126});
  }
}
