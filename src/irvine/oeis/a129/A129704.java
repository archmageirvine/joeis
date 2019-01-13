package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129704.
 * @author Sean A. Irvine
 */
public class A129704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129704() {
    super(new long[] {1, -2, 1, -2, 1}, new long[] {-1, -1, 1, 2, 1});
  }
}
