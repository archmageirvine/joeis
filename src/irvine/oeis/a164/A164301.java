package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164301.
 * @author Sean A. Irvine
 */
public class A164301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164301() {
    super(new long[] {-23, 10}, new long[] {1, 13});
  }
}
