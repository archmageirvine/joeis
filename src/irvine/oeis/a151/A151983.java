package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151983.
 * @author Sean A. Irvine
 */
public class A151983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151983() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 32});
  }
}
