package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109113 a(n) = 6a(n-1) + 3a(n-2), a(0)=2, a(1)=14.
 * @author Sean A. Irvine
 */
public class A109113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109113() {
    super(new long[] {3, 6}, new long[] {2, 14});
  }
}
