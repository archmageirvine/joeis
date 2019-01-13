package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072229.
 * @author Sean A. Irvine
 */
public class A072229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072229() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 0, 1, 2, 3, 4});
  }
}
