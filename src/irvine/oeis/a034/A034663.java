package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034663.
 * @author Sean A. Irvine
 */
public class A034663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034663() {
    super(new long[] {-441, 672, -262, 32}, new long[] {4, 32, 500, 9632});
  }
}
