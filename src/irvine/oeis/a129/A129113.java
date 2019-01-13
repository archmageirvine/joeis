package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129113.
 * @author Sean A. Irvine
 */
public class A129113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129113() {
    super(new long[] {-1, 1, 5, 1}, new long[] {0, 0, 0, 1});
  }
}
