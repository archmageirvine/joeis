package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192974.
 * @author Sean A. Irvine
 */
public class A192974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192974() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {0, 1, 4, 14, 37});
  }
}
