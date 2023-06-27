package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103374 a(1) = a(2) = a(3) = a(4) = a(5) = a(6) = a(7) = 1 and for n&gt;7: a(n) = a(n-6) + a(n-7).
 * @author Sean A. Irvine
 */
public class A103374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103374() {
    super(1, new long[] {1, 1, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}
