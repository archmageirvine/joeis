package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066830 a(n) = lcm(n+1, n-1).
 * @author Sean A. Irvine
 */
public class A066830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066830() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 3, 4, 15, 12, 35});
  }
}
