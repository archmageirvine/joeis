package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021076 Expansion of 1/((1-x)(1-2x)(1-4x)(1-6x)).
 * @author Sean A. Irvine
 */
public class A021076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021076() {
    super(new long[] {-48, 92, -56, 13}, new long[] {1, 13, 113, 833});
  }
}
