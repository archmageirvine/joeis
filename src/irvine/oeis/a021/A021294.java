package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021294 Expansion of <code>1/((1-x)(1-2x)(1-9x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A021294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021294() {
    super(new long[] {-198, 337, -161, 23}, new long[] {1, 23, 368, 5098});
  }
}
