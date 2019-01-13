package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024434.
 * @author Sean A. Irvine
 */
public class A024434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024434() {
    super(new long[] {-660, 896, -263, 28}, new long[] {1, 28, 521, 8120});
  }
}
