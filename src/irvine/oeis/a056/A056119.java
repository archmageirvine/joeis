package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056119 a(n) = n*(n+13)/2.
 * @author Sean A. Irvine
 */
public class A056119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056119() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 15});
  }
}
