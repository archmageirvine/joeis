package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016211 Expansion of 1/((1-x)(1-3x)(1-6x)).
 * @author Sean A. Irvine
 */
public class A016211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016211() {
    super(new long[] {18, -27, 10}, new long[] {1, 10, 73});
  }
}
