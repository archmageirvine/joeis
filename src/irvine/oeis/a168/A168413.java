package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168413 a(n) = 9*n - a(n-1) - 5, with a(1)=2.
 * @author Sean A. Irvine
 */
public class A168413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168413() {
    super(new long[] {-1, 1, 1}, new long[] {2, 11, 11});
  }
}
