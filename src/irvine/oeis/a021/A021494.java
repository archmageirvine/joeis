package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021494 Expansion of <code>1/((1-x)(1-3x)(1-6x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A021494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021494() {
    super(new long[] {-126, 207, -97, 17}, new long[] {1, 17, 192, 1822});
  }
}
