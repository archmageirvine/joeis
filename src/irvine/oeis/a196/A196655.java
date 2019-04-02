package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196655 33*2^(n+1) + 7.
 * @author Sean A. Irvine
 */
public class A196655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196655() {
    super(new long[] {-2, 3}, new long[] {73, 139});
  }
}
