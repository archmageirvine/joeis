package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164468.
 * @author Sean A. Irvine
 */
public class A164468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164468() {
    super(new long[] {-1, 1, -1, 2}, new long[] {13, 20, 30, 45});
  }
}
