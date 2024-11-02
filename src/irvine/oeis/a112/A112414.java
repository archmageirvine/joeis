package irvine.oeis.a112;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A112414 a(n) = 3*n + 7.
 * @author Sean A. Irvine
 */
public class A112414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112414() {
    super(new long[] {-1, 2}, new long[] {7, 10});
  }
}
