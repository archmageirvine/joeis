package irvine.oeis.a113;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A113439 a(n) = a(n-1) + Sum_{k=1..floor(n/4)} a(n-4k), with a(0)=1.
 * @author Sean A. Irvine
 */
public class A113439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113439() {
    super(new long[] {-1, 2, 0, 0, 1}, new long[] {1, 1, 1, 1, 2});
  }
}
