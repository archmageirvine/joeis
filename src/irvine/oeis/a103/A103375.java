package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103375 a(1) = a(2) = a(3) = a(4) = a(5) = a(6) = a(7) = a(8) = 1 and for n&gt;8: a(n) = a(n-7) + a(n-8).
 * @author Sean A. Irvine
 */
public class A103375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103375() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}
