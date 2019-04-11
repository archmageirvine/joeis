package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021804 Expansion of <code>1/((1-x)(1-4x)(1-6x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A021804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021804() {
    super(new long[] {-168, 262, -111, 18}, new long[] {1, 18, 213, 2098});
  }
}
