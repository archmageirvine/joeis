package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021144 Expansion of <code>1/((1-x)(1-2x)(1-5x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A021144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021144() {
    super(new long[] {-100, 180, -97, 18}, new long[] {1, 18, 227, 2520});
  }
}
