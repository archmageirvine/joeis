package irvine.oeis.a119;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A119032 a(n+2) = 18*a(n+1) - a(n) + 8.
 * @author Sean A. Irvine
 */
public class A119032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119032() {
    super(1, new long[] {1, -19, 19}, new long[] {0, 9, 170});
  }
}
