package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024133 <code>a(n) = 11^n - n^6</code>.
 * @author Sean A. Irvine
 */
public class A024133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024133() {
    super(new long[] {-11, 78, -238, 406, -420, 266, -98, 18}, new long[] {1, 10, 57, 602, 10545, 145426, 1724905, 19369522});
  }
}
