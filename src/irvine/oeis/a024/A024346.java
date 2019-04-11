package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024346 Expansion of <code>1/((1-x)(1-6x)(1-9x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A024346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024346() {
    super(new long[] {-594, 813, -245, 27}, new long[] {1, 27, 484, 7266});
  }
}
