package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048473 a(0)=1, a(n) = 3*a(n-1) + 2; a(n) = 2*3^n - 1.
 * @author Sean A. Irvine
 */
public class A048473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048473() {
    super(new long[] {-3, 4}, new long[] {1, 5});
  }
}
