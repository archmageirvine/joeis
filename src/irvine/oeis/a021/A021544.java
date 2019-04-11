package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021544 Expansion of <code>1/((1-x)(1-3x)(1-7x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A021544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021544() {
    super(new long[] {-168, 269, -119, 19}, new long[] {1, 19, 242, 2606});
  }
}
