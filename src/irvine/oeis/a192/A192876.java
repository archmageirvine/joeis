package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192876.
 * @author Sean A. Irvine
 */
public class A192876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192876() {
    super(new long[] {4, -6, -5, 6, 2}, new long[] {1, 1, 4, 9, 31});
  }
}
