package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023038 a(n) = 12*a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A023038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023038() {
    super(new long[] {-1, 12}, new long[] {1, 6});
  }
}
