package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020572 Expansion of 1/((1-6x)(1-7x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A020572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020572() {
    super(new long[] {420, -172, 23}, new long[] {1, 23, 357});
  }
}
