package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017918 Expansion of 1/((1-3x)(1-5x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A017918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017918() {
    super(new long[] {180, -111, 20}, new long[] {1, 20, 289});
  }
}
