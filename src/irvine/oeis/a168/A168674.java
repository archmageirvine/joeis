package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168674 a(n) = 2*A001610(n).
 * @author Sean A. Irvine
 */
public class A168674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168674() {
    super(new long[] {-1, 0, 2}, new long[] {0, 4, 6});
  }
}
