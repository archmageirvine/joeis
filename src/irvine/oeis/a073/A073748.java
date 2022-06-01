package irvine.oeis.a073;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A073748 a(n) = S(n)*S(n-1), where S(n) are the generalized tribonacci numbers A001644.
 * @author Sean A. Irvine
 */
public class A073748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073748() {
    super(new long[] {-1, 0, -1, 6, 3, 2}, new long[] {-3, 3, 3, 21, 77, 231});
  }
}
