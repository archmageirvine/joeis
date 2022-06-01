package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185346 a(n) = 2^n - 9.
 * @author Sean A. Irvine
 */
public class A185346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185346() {
    super(new long[] {-2, 3}, new long[] {-8, -7});
  }
}
