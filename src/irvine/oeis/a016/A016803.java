package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016803 a(n) = (4*n)^3.
 * @author Sean A. Irvine
 */
public class A016803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016803() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 64, 512, 1728});
  }
}
