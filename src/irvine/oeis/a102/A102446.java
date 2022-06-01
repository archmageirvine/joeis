package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102446 a(n) = a(n-1) + 4*a(n-2) for n&gt;1, a(0) = a(1) = 2.
 * @author Sean A. Irvine
 */
public class A102446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102446() {
    super(new long[] {4, 1}, new long[] {2, 2});
  }
}
