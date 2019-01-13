package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022318.
 * @author Sean A. Irvine
 */
public class A022318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022318() {
    super(new long[] {-1, 0, 2}, new long[] {1, 4, 6});
  }
}
