package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113778 Invert blocks of four in the sequence of natural numbers.
 * @author Sean A. Irvine
 */
public class A113778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113778() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {4, 3, 2, 1, 8});
  }
}
