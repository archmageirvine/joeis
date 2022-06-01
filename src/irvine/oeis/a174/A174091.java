package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174091 a(n) = n OR 2.
 * @author Sean A. Irvine
 */
public class A174091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174091() {
    super(new long[] {-1, 2, -2, 2}, new long[] {2, 3, 2, 3});
  }
}
