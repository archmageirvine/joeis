package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022968 a(n) = 12-n.
 * @author Sean A. Irvine
 */
public class A022968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022968() {
    super(new long[] {-1, 2}, new long[] {12, 11});
  }
}
