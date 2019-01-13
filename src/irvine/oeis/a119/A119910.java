package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119910.
 * @author Sean A. Irvine
 */
public class A119910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119910() {
    super(new long[] {-1, 1}, new long[] {1, 3});
  }
}
