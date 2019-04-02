package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024446 Expansion of 1/((1-x)(1-7x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A024446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024446() {
    super(new long[] {-924, 1217, -323, 31}, new long[] {1, 31, 638, 10982});
  }
}
