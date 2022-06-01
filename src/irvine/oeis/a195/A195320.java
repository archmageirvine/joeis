package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195320 7 times hexagonal numbers: 7*n*(2*n-1).
 * @author Sean A. Irvine
 */
public class A195320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195320() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 42});
  }
}
