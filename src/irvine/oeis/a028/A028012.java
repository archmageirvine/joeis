package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028012 Expansion of <code>1/((1-2x)(1-7x)(1-10x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A028012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028012() {
    super(new long[] {-1540, 1284, -313, 30}, new long[] {1, 30, 587, 9504});
  }
}
