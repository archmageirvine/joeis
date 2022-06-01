package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090247 a(n) = 26*a(n-1) - a(n-2), starting with a(0) = 2 and a(1) = 26.
 * @author Sean A. Irvine
 */
public class A090247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090247() {
    super(new long[] {-1, 26}, new long[] {2, 26});
  }
}
