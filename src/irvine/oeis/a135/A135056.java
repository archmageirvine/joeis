package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135056 Pentanacci numbers: a(n) = a(n-1) + a(n-2) + a(n-3) + a(n-4) + a(n-5) if n&gt;=5, and a(n) = n otherwise.
 * @author Sean A. Irvine
 */
public class A135056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135056() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {0, 1, 2, 3, 4});
  }
}
