package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024438 Expansion of 1/((1-x)(1-7x)(1-8x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A024438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024438() {
    super(new long[] {-560, 766, -231, 26}, new long[] {1, 26, 445, 6330});
  }
}
