package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123958.
 * @author Sean A. Irvine
 */
public class A123958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123958() {
    super(new long[] {-2, -2, 0}, new long[] {0, 0, 1});
  }
}
