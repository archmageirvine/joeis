package irvine.oeis.a260;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A260160 a(n) = a(n-2) + a(n-6) - a(n-8) with n&gt;8, the first eight terms are 0 except that for a(5) = a(7) = 1.
 * @author Sean A. Irvine
 */
public class A260160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260160() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 1, 0}, new long[] {0, 0, 0, 0, 1, 0, 1, 0});
  }
}
