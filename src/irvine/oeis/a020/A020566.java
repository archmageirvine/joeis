package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020566 Expansion of 1/((1-5x)(1-9x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A020566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020566() {
    super(new long[] {540, -213, 26}, new long[] {1, 26, 463});
  }
}
