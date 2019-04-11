package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260160 <code>a(n) = a(n-2) + a(n-6) - a(n-8)</code> with <code>n&gt;8,</code> the first eight terms are 0 except that for <code>a(5) = a(7) = 1</code>.
 * @author Sean A. Irvine
 */
public class A260160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260160() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 1, 0}, new long[] {0, 0, 0, 0, 1, 0, 1, 0});
  }
}
