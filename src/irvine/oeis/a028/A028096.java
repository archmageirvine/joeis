package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028096 Expansion of <code>1/((1-3x)(1-7x)(1-10x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A028096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028096() {
    super(new long[] {-2310, 1541, -341, 31}, new long[] {1, 31, 620, 10190});
  }
}
