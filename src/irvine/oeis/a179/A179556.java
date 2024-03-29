package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179556 a(1) = 10; a(n) = a(n-1)*10 - 2^(n-2).
 * @author Sean A. Irvine
 */
public class A179556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179556() {
    super(1, new long[] {-20, 12}, new long[] {10, 99});
  }
}
