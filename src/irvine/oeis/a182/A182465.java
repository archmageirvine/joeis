package irvine.oeis.a182;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A182465 a(n) = 3a(n-1) - 2a(n-2) with a(0)=28 and a(1)=70.
 * @author Sean A. Irvine
 */
public class A182465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182465() {
    super(new long[] {-2, 3}, new long[] {28, 70});
  }
}
