package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119910 Period 6: repeat [1, 3, 2, -1, -3, -2].
 * @author Sean A. Irvine
 */
public class A119910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119910() {
    super(new long[] {-1, 1}, new long[] {1, 3});
  }
}
