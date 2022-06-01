package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074148 a(n) = n + floor(n^2/2).
 * @author Sean A. Irvine
 */
public class A074148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074148() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 4, 7, 12});
  }
}
