package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128788 a(n) = n^2*9^n.
 * @author Sean A. Irvine
 */
public class A128788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128788() {
    super(new long[] {729, -243, 27}, new long[] {0, 9, 324});
  }
}
