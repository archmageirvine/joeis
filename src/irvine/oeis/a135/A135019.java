package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135019.
 * @author Sean A. Irvine
 */
public class A135019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135019() {
    super(new long[] {-1, 2, -1}, new long[] {0, 1, -3});
  }
}
