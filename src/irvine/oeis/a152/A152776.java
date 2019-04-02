package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152776 Numbers such that every run length in base 2 is 3.
 * @author Sean A. Irvine
 */
public class A152776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152776() {
    super(new long[] {-8, 1, 8}, new long[] {7, 56, 455});
  }
}
