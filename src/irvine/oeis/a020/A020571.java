package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020571 Expansion of 1/((1-6x)(1-7x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A020571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020571() {
    super(new long[] {378, -159, 22}, new long[] {1, 22, 325});
  }
}
