package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025931 Expansion of 1/((1-2x)(1-3x)(1-5x)(1-7x)).
 * @author Sean A. Irvine
 */
public class A025931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025931() {
    super(new long[] {-210, 247, -101, 17}, new long[] {1, 17, 188, 1726});
  }
}
