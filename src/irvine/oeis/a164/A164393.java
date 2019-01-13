package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164393.
 * @author Sean A. Irvine
 */
public class A164393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164393() {
    super(new long[] {1, -2, 0, 0, 2}, new long[] {1, 2, 4, 8, 14});
  }
}
