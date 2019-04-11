package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060464 Numbers that are not congruent to 4 or <code>5 mod 9</code>.
 * @author Sean A. Irvine
 */
public class A060464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060464() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 6, 7, 8, 9});
  }
}
