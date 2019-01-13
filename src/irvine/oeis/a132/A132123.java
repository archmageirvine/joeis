package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132123.
 * @author Sean A. Irvine
 */
public class A132123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132123() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 11, 110, 469, 1356});
  }
}
