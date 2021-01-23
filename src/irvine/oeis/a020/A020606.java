package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020606 Expansion of 1/((1-6x)(1-9x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A020606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020606() {
    super(new long[] {594, -219, 26}, new long[] {1, 26, 457});
  }
}
