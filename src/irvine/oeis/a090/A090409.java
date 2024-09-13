package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090409 a(n) = (7*8^n + 2*(-1)^n)/9.
 * @author Sean A. Irvine
 */
public class A090409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090409() {
    super(new long[] {8, 7}, new long[] {1, 6});
  }
}
