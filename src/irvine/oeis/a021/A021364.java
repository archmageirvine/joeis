package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021364 Expansion of <code>1/((1-x)(1-3x)(1-4x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A021364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021364() {
    super(new long[] {-84, 145, -75, 15}, new long[] {1, 15, 150, 1270});
  }
}
