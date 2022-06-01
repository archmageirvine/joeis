package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074570 a(n) = 4^n + 8^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074570() {
    super(new long[] {288, -140, 21}, new long[] {3, 21, 161});
  }
}
