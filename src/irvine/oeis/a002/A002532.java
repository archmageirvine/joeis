package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002532 <code>a(n) = 2*a(n-1) + 5*a(n-2), a(0) = 0, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A002532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002532() {
    super(new long[] {5, 2}, new long[] {0, 1});
  }
}
