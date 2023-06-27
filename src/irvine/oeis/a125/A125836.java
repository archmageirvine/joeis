package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125836 Numbers whose base 8 or octal representation is 555555555......5.
 * @author Sean A. Irvine
 */
public class A125836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125836() {
    super(1, new long[] {-8, 9}, new long[] {0, 5});
  }
}
