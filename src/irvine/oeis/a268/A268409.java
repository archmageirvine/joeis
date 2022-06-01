package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268409 a(n) = 4*a(n - 1) + 2*a(n - 2) for n&gt;1, a(0)=3, a(1)=5.
 * @author Sean A. Irvine
 */
public class A268409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268409() {
    super(new long[] {2, 4}, new long[] {3, 5});
  }
}
