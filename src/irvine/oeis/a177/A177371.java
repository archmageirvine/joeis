package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177371.
 * @author Sean A. Irvine
 */
public class A177371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177371() {
    super(new long[] {8, 0, -28, 14, 6}, new long[] {1, 18, 98, 812, 5748});
  }
}
