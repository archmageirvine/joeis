package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135370 a(1)=1; then if n even a(n) = n + a(n-1), if n odd a(n) = 2*n + a(n-1).
 * @author Sean A. Irvine
 */
public class A135370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135370() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 3, 9, 13, 23});
  }
}
