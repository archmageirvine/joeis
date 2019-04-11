package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021714 Expansion of <code>1/((1-x)(1-3x)(1-10x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A021714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021714() {
    super(new long[] {-330, 503, -197, 25}, new long[] {1, 25, 428, 6278});
  }
}
