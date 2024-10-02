package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140062 a(n) = 101*2^(n-1) - 100.
 * @author Sean A. Irvine
 */
public class A140062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140062() {
    super(1, new long[] {-2, 3}, new long[] {1, 102});
  }
}
