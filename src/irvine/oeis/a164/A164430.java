package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164430.
 * @author Sean A. Irvine
 */
public class A164430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164430() {
    super(new long[] {-1, -1, -1, 0, 1, 1, 1}, new long[] {13, 21, 36, 62, 105, 178, 303});
  }
}
