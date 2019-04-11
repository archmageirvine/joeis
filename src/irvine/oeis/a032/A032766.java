package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032766 Numbers that are congruent to 0 or <code>1 (mod 3)</code>.
 * @author Sean A. Irvine
 */
public class A032766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032766() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 3});
  }
}
