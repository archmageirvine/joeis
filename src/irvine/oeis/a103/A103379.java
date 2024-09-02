package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103379 a(n) = a(n-11) + a(n-12).
 * @author Sean A. Irvine
 */
public class A103379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103379() {
    super(1, new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
