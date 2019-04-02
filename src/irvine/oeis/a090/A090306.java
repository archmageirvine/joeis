package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090306 a(n) = 17a(n-1) + a(n-2), starting with a(0) = 2 and a(1) = 17.
 * @author Sean A. Irvine
 */
public class A090306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090306() {
    super(new long[] {1, 17}, new long[] {2, 17});
  }
}
