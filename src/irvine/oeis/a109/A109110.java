package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109110 a(n) = 2a(n-1) + a(n-2) - a(n-3); a(0)=4, a(1)=9, a(2)=20.
 * @author Sean A. Irvine
 */
public class A109110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109110() {
    super(new long[] {-1, 1, 2}, new long[] {4, 9, 20});
  }
}
