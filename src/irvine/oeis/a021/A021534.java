package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021534 Expansion of 1/((1-x)(1-3x)(1-6x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A021534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021534() {
    super(new long[] {-216, 342, -147, 22}, new long[] {1, 22, 337, 4522});
  }
}
