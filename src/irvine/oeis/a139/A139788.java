package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139788 Period 5: repeat 1, 7, 3, 9, 5.
 * @author Sean A. Irvine
 */
public class A139788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139788() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 7, 3, 9, 5});
  }
}
