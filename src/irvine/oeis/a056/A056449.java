package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056449 a(n) = 3^floor((n+1)/2).
 * @author Sean A. Irvine
 */
public class A056449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056449() {
    super(new long[] {3, 0}, new long[] {1, 3});
  }
}
