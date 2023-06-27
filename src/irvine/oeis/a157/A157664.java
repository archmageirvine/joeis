package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157664 a(n) = 80000*n^2 + 800*n + 1.
 * @author Sean A. Irvine
 */
public class A157664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157664() {
    super(1, new long[] {1, -3, 3}, new long[] {80801, 321601, 722401});
  }
}
