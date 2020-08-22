package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090248 a(n) = 27a(n-1) - a(n-2), starting with a(0) = 2 and a(1) = 27.
 * @author Sean A. Irvine
 */
public class A090248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090248() {
    super(new long[] {-1, 27}, new long[] {2, 27});
  }
}
