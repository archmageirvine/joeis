package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019854 Expansion of 1/((1-5x)(1-6x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A019854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019854() {
    super(new long[] {330, -151, 22}, new long[] {1, 22, 333});
  }
}
