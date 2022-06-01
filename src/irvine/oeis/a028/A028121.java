package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028121 Expansion of 1/((1-4x)(1-5x)(1-8x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A028121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028121() {
    super(new long[] {-1600, 1080, -262, 27}, new long[] {1, 27, 467, 6615});
  }
}
