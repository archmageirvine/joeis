package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089314 Sum of all digits in all even numbers from 0 to <code>444...4 (with n 4's)</code>.
 * @author Sean A. Irvine
 */
public class A089314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089314() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 6, 128, 2220});
  }
}
