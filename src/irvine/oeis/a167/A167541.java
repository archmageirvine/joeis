package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167541 a(n) = -(n - 4)*(n - 5)*(n - 12)/6.
 * @author Sean A. Irvine
 */
public class A167541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167541() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 5, 8, 10});
  }
}
