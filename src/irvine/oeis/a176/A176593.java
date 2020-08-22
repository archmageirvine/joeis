package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176593 List of pairs n,13*n.
 * @author Sean A. Irvine
 */
public class A176593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176593() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 13, 2, 26});
  }
}
