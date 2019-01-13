package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192848.
 * @author Sean A. Irvine
 */
public class A192848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192848() {
    super(new long[] {-1, 4, -6, 4}, new long[] {12, 96, 300, 672});
  }
}
