package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178676 a(n) = 5^n + 5.
 * @author Sean A. Irvine
 */
public class A178676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178676() {
    super(new long[] {-5, 6}, new long[] {6, 10});
  }
}
