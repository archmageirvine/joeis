package irvine.oeis.a001;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A001946 a(n) = 11*a(n-1) + a(n-2).
 * @author Sean A. Irvine
 */
public class A001946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001946() {
    super(new long[] {1, 11}, new long[] {2, 11});
  }
}
