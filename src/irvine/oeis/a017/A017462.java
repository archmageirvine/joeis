package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017462 a(n) = (11*n + 6)^2.
 * @author Sean A. Irvine
 */
public class A017462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017462() {
    super(new long[] {1, -3, 3}, new long[] {36, 289, 784});
  }
}
