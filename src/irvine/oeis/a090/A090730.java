package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090730 a(n) = 22*a(n-1) - a(n-2), starting with a(0) = 2 and a(1) = 22.
 * @author Sean A. Irvine
 */
public class A090730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090730() {
    super(new long[] {-1, 22}, new long[] {2, 22});
  }
}
