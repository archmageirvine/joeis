package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086951 a(n) = n*3^n*(4*n - 1)/9.
 * @author Sean A. Irvine
 */
public class A086951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086951() {
    super(new long[] {27, -27, 9}, new long[] {0, 1, 14});
  }
}
