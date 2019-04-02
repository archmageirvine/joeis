package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022986 30-n.
 * @author Sean A. Irvine
 */
public class A022986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022986() {
    super(new long[] {-1, 2}, new long[] {30, 29});
  }
}
