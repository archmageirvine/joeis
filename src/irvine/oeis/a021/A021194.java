package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021194 Expansion of <code>1/((1-x)(1-2x)(1-6x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A021194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021194() {
    super(new long[] {-108, 192, -101, 18}, new long[] {1, 18, 223, 2388});
  }
}
