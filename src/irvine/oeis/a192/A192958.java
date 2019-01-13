package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192958.
 * @author Sean A. Irvine
 */
public class A192958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192958() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, -1, 3, 7});
  }
}
