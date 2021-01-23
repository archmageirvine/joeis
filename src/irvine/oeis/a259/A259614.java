package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259614 Numbers congruent to {17,29} mod 36.
 * @author Sean A. Irvine
 */
public class A259614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259614() {
    super(new long[] {-1, 1, 1}, new long[] {17, 29, 53});
  }
}
