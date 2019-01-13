package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192963.
 * @author Sean A. Irvine
 */
public class A192963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192963() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {0, 1, 3, 10, 25});
  }
}
