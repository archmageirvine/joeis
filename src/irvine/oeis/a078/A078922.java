package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078922 a(n) = 11*a(n-1) - a(n-2) with a(1)=1, a(2) = 10.
 * @author Sean A. Irvine
 */
public class A078922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078922() {
    super(1, new long[] {-1, 11}, new long[] {1, 10});
  }
}
