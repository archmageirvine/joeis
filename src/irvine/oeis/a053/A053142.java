package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053142 a(n) = A053141(n)/2.
 * @author Sean A. Irvine
 */
public class A053142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053142() {
    super(new long[] {1, -7, 7}, new long[] {0, 1, 7});
  }
}
