package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080041 a(n) = floor((1+sqrt(3))^n).
 * @author Sean A. Irvine
 */
public class A080041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080041() {
    super(new long[] {-2, -2, 3, 2}, new long[] {1, 2, 7, 20});
  }
}
