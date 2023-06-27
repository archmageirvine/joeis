package irvine.oeis.a242;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A242774 a(n) = ceiling( n / 2 ) + ceiling( n / 3 ).
 * @author Sean A. Irvine
 */
public class A242774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242774() {
    super(1, new long[] {-1, 0, 1, 1, 0}, new long[] {2, 2, 3, 4, 5});
  }
}
