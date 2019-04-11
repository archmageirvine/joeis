package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021034 Expansion of <code>1/((1-x)(1-2x)(1-3x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A021034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021034() {
    super(new long[] {-42, 83, -53, 13}, new long[] {1, 13, 116, 902});
  }
}
