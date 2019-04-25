package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048635 Number of rational points of Klein curve over <code>GF(2^n)</code>.
 * @author Sean A. Irvine
 */
public class A048635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048635() {
    super(new long[] {-4, 8, -7, 4}, new long[] {0, 14, 24, 14});
  }
}
