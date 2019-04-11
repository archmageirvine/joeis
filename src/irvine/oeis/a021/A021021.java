package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021021 Expansion of <code>1/((1-10x)(1-11x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A021021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021021() {
    super(new long[] {1320, -362, 33}, new long[] {1, 33, 727});
  }
}
