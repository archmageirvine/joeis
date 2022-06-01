package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262523 a(n+3) = a(n) + 6*n + 13, a(0)=0, a(1)=2, a(2)=7.
 * @author Sean A. Irvine
 */
public class A262523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262523() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 2, 7, 13, 21});
  }
}
