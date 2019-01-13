package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022319.
 * @author Sean A. Irvine
 */
public class A022319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022319() {
    super(new long[] {-1, 0, 2}, new long[] {1, 5, 7});
  }
}
