package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103380 a(n) = a(n-12) + a(n-13).
 * @author Sean A. Irvine
 */
public class A103380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103380() {
    super(1, new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
