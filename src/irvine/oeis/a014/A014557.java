package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014557.
 * @author Sean A. Irvine
 */
public class A014557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014557() {
    super(new long[] {-1, 2, 0, -2, 2, -2, 0, 2}, new long[] {0, 0, 0, 0, 0, 0, 2, 4});
  }
}
