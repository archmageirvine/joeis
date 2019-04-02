package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140504 a(n) = 2^n + 4.
 * @author Sean A. Irvine
 */
public class A140504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140504() {
    super(new long[] {-2, 3}, new long[] {5, 6});
  }
}
