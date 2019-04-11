package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038138 Order of <code>n (mod 7)</code>.
 * @author Sean A. Irvine
 */
public class A038138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038138() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 3, 6, 3, 6, 2});
  }
}
